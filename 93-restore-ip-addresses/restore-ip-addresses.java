class Solution {
    private List<String> ips;
    private int l;
    public List<String> restoreIpAddresses(String s) {
        ips=new ArrayList<>();
        l=s.length();
        b(s,0,"",0);
        return ips;
    }
    private boolean isIp(String ip){
        if(ip.length() > 3 || ip.length() == 0) return false;
        if(ip.length() > 1 && ip.charAt(0) == '0') return false;
        if(ip.length() > 0 && Integer.parseInt(ip) > 255) return false;
        return true; 
   }
   private void b(String s, int index, String ip, int dot){
        if(dot==3){
            if(isIp(s.substring(index))){
                ip+=s.substring(index);
                ips.add(ip);
            }
            return;
        }
        for(int i=index;i<l;i++){
            if(isIp(s.substring(index, i+1))){
                int k=s.substring(index, i+1).length();
                ip+=s.substring(index, i+1)+".";
                b(s,i+1,ip,dot+1);
                ip=ip.substring(0,ip.length()-k-1);
            }
        }
   }
}