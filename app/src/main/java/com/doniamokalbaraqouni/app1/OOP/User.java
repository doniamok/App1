package com.doniamokalbaraqouni.app1.OOP;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.doniamokalbaraqouni.app1.R;
import com.doniamokalbaraqouni.app1.login;
import com.doniamokalbaraqouni.app1.registration;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;


public class User {
    public static User user;
    private FirebaseAuth mAuth;
    private ArrayList<BMIRecord> records = new ArrayList<BMIRecord>();
    private ArrayList<BMIFood> foods = new ArrayList<BMIFood>();
    private String name;
    private String email;
    private String password;
    private String bd;
    private boolean male;

    public User(EditText name, EditText email, EditText password, EditText re_password, AppCompatActivity context)throws UserInfException{
        if(!name.matches("[A-Za-z\\s]+"))throw new UserInfException("name") ;
        if(!email.matches("[A-za-z][\\w]{2,10}\\.com"))throw new UserInfException("email") ;
        if(!password.equals(re_password))throw new UserInfException("re-password") ;
        if(password.length()<3)throw new UserInfException("re-password") ;
        this.name = name;
        this.email = email;
        this.password = password;
        FireBaseConnection.registration(this, context);

    }



    public FirebaseAuth getmAuth() {
        return mAuth;
    }

    public void setmAuth(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDate() {
        return bd;
    }

    boolean isMale() {
        return male;
    }

    public String getGender() {
        return this.isMale() ? "Male" : "Female";
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setGender(String gender) {
        this.setMale(gender.equalsIgnoreCase("Male"));
    }


    public boolean isNewUser() {
        return false;
    }


    public void updateLists(DataSnapshot dataSnapshot, AppCompatActivity actv) {
    }

    public int getHomeMessage() {

        return 0;
    }


}


/**before firebase**/
/**public class User {
    private ArrayList<BMIRecord> records ;
    private ArrayList<BMIFood> foods  ;

    public User() {
        this.records = new ArrayList<BMIRecord>();
        records.add(new BMIRecord(80, 170, "9/12/2021", "Normal"));
        records.add(new BMIRecord(70, 190, "9/1/2021", "Normal"));
        records.add(new BMIRecord(50, 150, "1/5/2021", "Normal"));
        this.foods= new ArrayList<BMIFood>() ;
        foods.add(new BMIFood("Salamon","Fish",22)) ;
        foods.add(new BMIFood("Rais","Carbohydrates",30)) ;
        foods.add(new BMIFood("Banana","Fruit",2)) ;
        foods.add(new BMIFood("Apple","Fruit",4)) ;
        foods.add(new BMIFood("Orange","Fruit",2)) ;
    }


    public ArrayList<BMIRecord>getRecords() {
        return records;
    }
    public ArrayList<BMIFood>getFoods(){return foods ;}

}**/





