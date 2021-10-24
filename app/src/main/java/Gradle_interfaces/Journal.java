package Gradle_interfaces;
import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
public class Journal extends Publishing{
    private int number;

    public Journal(String code, String title, int publicationYear, int number){
        super(code,title,publicationYear);
        this.number = number;
    }
    @Override
    public String toString(){
        return "Code: "+ code +", Title: "+ title +", Year: "+ publicationYear +", Number: "+ number;
    }
}
