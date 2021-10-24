package Gradle_interfaces;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Book extends Publishing implements Loanable{
    private boolean lent;
    public Book(String code, String title, int publicationYear){
        super(code,title,publicationYear);
        this.lent = false;
    }
    @Override
    public String toString(){
        return "Code: "+code+", Title: "+title+", Year: "+publicationYear+", Lent: "+lent;
    }
    @Override
    public void toLend(){
        lent = true;
    }
    @Override
    public void toReturn(){
        lent = false;
    }
    @Override
    public void isLent(){
        System.out.println("Lent = "+lent);
    }
}
