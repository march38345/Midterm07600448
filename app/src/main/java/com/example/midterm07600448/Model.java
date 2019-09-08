package com.example.midterm07600448;

public class Model {
   private final String user1 = "aaa";
   private final String pass1 = "111";
   private final String user2 = "bbb";
   private final String pass2 = "222";
    String edituser;
    String editpass;
    public String getEdituser() {
        return edituser;
    }

    public String getEditpass() {
        return editpass;
    }
//397 /600
    public void setEdituser(String edituser) {
        this.edituser = edituser;
    }

    public void setEditpass(String editpass) {
        this.editpass = editpass;
    }


    public Model(String user,String pass) {
        this.edituser = user;
        this.editpass = pass;

    }

    int sheck(){
        if(edituser.equals(user1)&&editpass.equals(pass1)){
            return 1;
        }
        else if(edituser.equals(user2)&&editpass.equals(pass2)){
            return 2;
        }
        else{
            return 0;

        }



    }
}
