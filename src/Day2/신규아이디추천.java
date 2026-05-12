package Day2;

public class 신규아이디추천 {

    public static void main(String[] args) {

        String new_id = "abcdefghijklmn.p";

        //1단계
        new_id = new_id.toLowerCase();
        System.out.println(new_id);

        //2단계
        new_id = new_id.replaceAll("[^a-z0-9-._]", "");
        System.out.println(new_id);

        //3단계
        new_id = new_id.replaceAll("[.]{2,}", ".");
        System.out.println(new_id);

        //4단계
        new_id = new_id.replaceAll("^[.]", "");
        new_id = new_id.replaceAll("[.]$", "");
        System.out.println(new_id);

        //5단계
        if (new_id.isEmpty()){
            new_id += "a";
        }
        System.out.println(new_id);

        //6단계
        if (new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        System.out.println(new_id);

        //7단계
        while(new_id.length()<3){
                new_id += new_id.charAt(new_id.length()-1);
        }
//        return new_id;
    }

}
