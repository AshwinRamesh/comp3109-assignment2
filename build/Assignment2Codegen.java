import java.util.ArrayList;
class Assignment2Codegen {


    //Returns a string with each element in the ArrayList seperated by the string sep
    //Similar to Python/JavaScript's join function
    public static String join(ArrayList<String> list, String sep) {

        StringBuilder sb = new StringBuilder();
        //loop to every element except the last one so we don't add the separator on the end
        for (int i = 0; i < list.size() - 1; i++)
        {
            sb.append(list.get(i) + sep);
        }
        sb.append(list.get(list.size() - 1));

        return sb.toString();

    }


}

class Block {

    private ArrayList<String> code;
    private int number;
    private int currentRegister;

    // Used to create an empty block, in case we need to do that.
    public Block() {
        code = new ArrayList<String>();
        code.add("(");
    }

    public Block(int number, int register) {
        code = new ArrayList<String>();
        this.number = number;
        this.currentRegister = register;
        code.add("(" + number);
    }

    public void endBlock() {
        code.add(")");
    }

    public int getCurrentRegister() {
        return currentRegister;
    }

    public String toString() {
        return Assignment2Codegen.join(code, " ");
    }

}
