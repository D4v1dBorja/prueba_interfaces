package Gradle_interfaces;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Publishing {
    public String code;
    public String title;
    public int publicationYear;

    public Publishing(String code, String title, int publicationYear) {
        this.code = code;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String ToString(){
        return "Code: "+ code +", Title: "+ title +", Year: "+publicationYear;
    }
}
