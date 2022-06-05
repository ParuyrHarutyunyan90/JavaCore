package homework.braceChecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        boolean b = true;
        char pop;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop != 0) {
                        if (pop != '(') {
                            System.out.println("Error: opened " + pop + " closed ) at " + i);
                            b = false;
                        }
                    } else System.out.println("Error: no opened (");
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop != 0) {
                        if (pop != '{') {
                            System.out.println("Error: opened " + pop + " closed } at " + i);
                            b = false;
                        }
                    } else System.out.println("Error: no opened {");
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop != 0) {
                        if (pop != '[') {
                            System.out.println("Error: opened " + pop + " closed ] at " + i);
                            b = false;
                        }
                    } else System.out.println("Error: no opened [");
                    break;

            }

        }
        System.out.println(b);
    }

}

