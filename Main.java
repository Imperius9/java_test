import java.util.regex.Matcher;
import java.util.regex.Pattern;
class tests{
    public static Boolean isNumeric(String str){
        Pattern pattern=Pattern.compile("[0-9]*");
        Matcher isNum=pattern.matcher(str);
        if(!isNum.matches()){
            return false;
        }
        return true;
    }
}

public class Main {

    public  static void main(String[] args) {
        double x=1;
        double y=2;
        for (Operation operation : Operation.values()){
            System.out.print( x  );
            System.out.print( operation );
            System.out.print( y );
            System.out.println("=" + operation.apply(x,y));
        }
        Operation op = Operation.PLUS;
        System.out.println(op.apply(1,2));
        System.out.println(Week.THU.value);
    }
}

