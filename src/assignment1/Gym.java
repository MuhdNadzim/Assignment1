package assignment1;

public class Gym {
    
    String typeofexercise;
    String nameofcoach;
    String typeofequip;
    
public void setExericse(String typeofexercise){
    this.typeofexercise= typeofexercise;
}

public void setnameofcoach(String nameofcoach){
    this.nameofcoach= nameofcoach;
}

public void setequip(String typeofequip){
    this.typeofequip=typeofequip;
}

public String getExercise(){
    return this.typeofexercise;
}

public String getnameofcoach(){
    return this.nameofcoach;
}

public String getequip(){
    return this.typeofequip;
}
}
