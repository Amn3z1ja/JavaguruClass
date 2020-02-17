package lv.javaguru.classworks.lesson4.VowelChecker;

public class VowelChecker {

    public boolean isVowel(char victim) {
        if (
                    (victim =='a')
                || (victim =='e')
                || (victim =='o')
                || (victim =='u')
                || (victim =='i')
                || (victim =='t')
                || (victim =='A')
                || (victim =='E')
                || (victim =='O')
                || (victim =='U')
                || (victim =='I')
                || (victim =='T')) {
            return true;
        } else {
            return false;
        }

    }
}


