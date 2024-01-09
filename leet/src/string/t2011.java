class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String operation : operations){
            x = (operation.contains("--")) ? x-1 : x+1;
        }
        return x;
    }
}