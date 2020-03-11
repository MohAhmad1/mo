package ie.gmit;

public class Passenger {

    private String title;
    private String name;
    private int ID;
    private String phone;
    private int age;


    public Passenger(String title, String name, int ID, String phone, int age) {
        setTitle(title);
        setName(name);
        setID(ID);
        setPhone(phone);
        setAge(age);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if( (title == "Mr") || (title == "Mrs") || (title == "Ms") )
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Title");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3)
        {
            throw new IllegalArgumentException("Invalid Name");
        }
        else {
            this.name = name;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if( (ID < 1000000000) )
        {
            throw new IllegalArgumentException("Invalid ID");
        }
        else
        {
            this.ID = ID;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if( (phone.length() < 10) )
        {
            throw new IllegalArgumentException("Invalid Phone");
        }
        else
        {
            this.phone = phone;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( (age < 16) )
        {
            throw new IllegalArgumentException("Invalid Age");
        }
        else
        {
            this.age = age;
        }

    }
}
