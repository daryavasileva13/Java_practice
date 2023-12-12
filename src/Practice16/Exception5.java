package Practice16;

//public class Exception5 {
//    public void getDetails(String key) {
//        if(key == null) {
//            throw new NullPointerException("null key in getDetails" );
//        }
//        // do something with the key
//    }
//}

public class Exception5 {
    public void getDetails5(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                System.out.println("key is null");
            }
        }
    }
}

