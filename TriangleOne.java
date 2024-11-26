    public class TriangleOne {
        public static void print( String word ) {
            for (int i = word.length(); i > 0; i--) {
                System.out.println(word.substring(0, i));
            }
            System.out.println();
        }
    }