
class GfG {
    int convertfive(int num) {
        String s = Integer.toString(num);
        String s1 = s.replace("0","5");
        return(Integer.parseInt(s1));
      }
}
