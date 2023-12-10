public class Meta {
    public static void main(String[] args) {
        String a = "geeks";
        String b = "keegs";
        if(a.length()!=b.length()){
            System.out.println("No meta");
        }
        else{
            int ctr=0;
            int[] swap=new int[a.length()];
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i)){
                    swap[ctr]=i;
                    ctr++;
                }
            }
            if(ctr==2){
                String c="";
                for(int i=0;i<a.length();i++){
                    if(i!=swap[0] && i!=swap[1]){
                        c=c+a.charAt(i);
                    }
                    else if(i==swap[0]){
                        c=c+a.charAt(swap[1]);
                    }
                    else if(i==swap[1]){
                        c=c+a.charAt(swap[0]);
                    }
                }
                if(c.equals(b)){
                    System.out.println("META!");
                }
                else{
                    System.out.println("No meta");
                }
            }
            else{
                System.out.println("No meta");
            }
        }
    }
}
