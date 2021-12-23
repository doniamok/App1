package com.doniamokalbaraqouni.app1.OOP;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.doniamokalbaraqouni.app1.complete_information;
import com.doniamokalbaraqouni.app1.home;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Date;

public class FireBaseConnection {
    public static void addListenerForUserUpdate(AppCompatActivity actv) {
        DB.getCurrentUserData().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User.user.updateLists(dataSnapshot, actv);
                home.checkBMIChange();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public static void registration(User user, AppCompatActivity context) {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        user.setmAuth(mAuth);
        mAuth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
                .addOnCompleteListener(context, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            createUserData(context, user);
                        } else {
                            Toast.makeText(context, "Error,can't add User to firebase:" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }

    public static void login_user(AppCompatActivity context) {
        try {
            User.user.setmAuth(FirebaseAuth.getInstance());
            User.user.getmAuth().signInWithEmailAndPassword(User.user.getEmail(), User.user.getPassword())
                    .addOnCompleteListener(context, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull com.google.android.gms.tasks.Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                User.user.setmAuth(FirebaseAuth.getInstance());
                                addListenerForUserUpdate(context);
                                DB.getCurrentUserData().child("temp").setValue(new Date().toString());
                                Intent x;
                                if (User.user.isNewUser())
                                    x = new Intent(context, complete_information.class);
                                else
                                    x = new Intent(context, home.class);
                                context.startActivity(x);
                                context.finish();
                            } else {
                                Toast.makeText(context, "Invalid email or password", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public static void logout() {
        User.user.getmAuth().signOut();
    }

    public static void createUserData(AppCompatActivity context, User user) {
        try {
            DB.getCurrentUserName().setValue(user.getName())
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(context, "Failed to create user record:" + e.getMessage(), Toast.LENGTH_LONG).show();

                        }
                    })
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(@NonNull Void aVoid) {
                            move(context);
                        }
                    });

        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG);
        }
    }
    public static void completeUserData(User user){}
    public static void move(AppCompatActivity context){}
    public static void addBMIRecord(BMIRecord record){
      String key =DB.getCurrentUserBMIRecords().push().getKey() ;
      record.setId(key) ;
      DB.getCurrentUserBMIRecords().child(key).setValue(record) ;
    }
    public static void removeBMIRecord(BMIRecord record){
        DB.getCurrentUserBMIRecords().child(record.getId()).removeValue() ;
    }
    public static void addFood(BMIFood record){
        String key =DB.getCurrentUserFoods().push().getKey() ;
        record.setId(key) ;
        DB.getCurrentUserFoods().child(key).setValue(record) ;
    }
    public static void removeFood(BMIFood record){
        DB.getCurrentUserFoods().child(record.getId()).removeValue() ;
    }

    public static class DB{
        public static DatabaseReference getUsers(){
            return FirebaseDatabase.getInstance().getReference("Users") ;
    }
    public static DatabaseReference getCurrentUserData() {
        return getUsers().child(User.user.getmAuth().getCurrentUser().getUid());
    }
    public static DatabaseReference getCurrentUserFoods(){
            return getCurrentUserData().child("foods") ;
    }
    public static DatabaseReference getCurrentUserBMIRecords(){
            return getCurrentUserData().child("records") ;
    }
    public static DatabaseReference getCurrentUserName(){
            return getCurrentUserData().child("name") ;
    }
    public static DatabaseReference getCurrentUserGender(){
            return getCurrentUserData().child("gender") ;
    }
    public static DatabaseReference getCurrentUserBirthDate(){
            return getCurrentUserData().child("birthdate") ;
    }
    }
}
