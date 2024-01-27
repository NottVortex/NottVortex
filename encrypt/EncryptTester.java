import java.util.Scanner;
public class EncryptTester
{
    public static void main(String[] args)
    {
        String[] encryption = {"ecaps", "bawjw291", "dh298h", "ebe128", "2beu9", "ncwk", "291", 
        "ne20d", "dn281d23", "3djc9", "b2uid", "db21db", "d2biud3", "n3id3", "black", "h0le", "xpwo2", "zxz", "qsnsw", "nd3k", "n04h", 
        "143", "no193dche82d8is0cnot", "y3s", "ykin2929", "d289nd2", "cne3", "a201", "ve32", "ac1d", "nff893", "1ocw", "ne2", "t838c", "oc920",
        "b292", "u92cm", "em2d3", "q09c2", "c3incn", "xoowmc3", "pmce29", "2oc", "kc4nk", "c2l11", "mcnw", "k4t", "mc1m4n", "t1e",
        "dm2d3", "c9394", "vmem", "d2b3kjb", "cneo", "x29", "3dne", "c4ni", "zowk", "cpw", "loc", "cDc", "moe", "mxqo", "d23e2", "c03",
        "xwap", "ocep", "qls", "j91", "wns", "1s01", "lma", "oxpw", "nax", "icm", "bve", "clwap", "uqu", "cle", "2d923d", "movr",
        "92s", "3cnio3", "dd4", "rdr2", "dmor42", "pcepaw", "10s", "ccn3i", "jd92", "c3ni4", "v8r", "f94f", "12ds", "4ic4"
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Input any line of text to encrypt: ");
        String text = input.nextLine();
        Encrypt e = new Encrypt(text);
        
        e.eLoop();
        
        e.encryptInput(encryption);
        
        System.out.println("Encrypted version: " + e.outputEncrypt());
    }
}