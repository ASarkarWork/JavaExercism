class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for(int i = 0; i < dnaStrand.length(); i++) {
            char nucleotide = dnaStrand.charAt(i);

            char complement = '\u0000';

            //Maybe HashMap cleaner?
            switch(nucleotide) {
                case 'A':
                    complement = 'U';
                    break;
                case 'T':
                    complement = 'A';
                    break;
                case 'C':
                    complement = 'G';
                    break;
                case 'G':
                    complement = 'C';
                    break;
                default:
                    assert false: "Invalid nucleotide";
            }

            rnaStrand += complement;
        }

        return rnaStrand;
    }

}
