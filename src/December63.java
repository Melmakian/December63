import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class December63 {
    public static String greeting = "Hello";



    public static class OutputConsole implements Externalizable{
        private int i=8;


        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(i);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            i= in.readInt();
        }
        public void outputToConsole(int ii){
            for (int i = 0; i <greeting.length() ; i++) {
                System.out.println(greeting.charAt(i));

            }
        }
    }
}
