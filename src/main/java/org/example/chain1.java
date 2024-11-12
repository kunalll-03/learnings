package org.example;
import java.security.MessageDigest;
import java.util.ArrayList;

public class chain1 {
    public static void main(String[] args) {
        class Block {
            private String data;
            private String previousHash;
            private String hash;

            public Block(String data, String previousHash) {
                this.data = data;
                this.previousHash = previousHash;
                this.hash = calculateHash();
            }

            public String calculateHash() {
                try {
                    MessageDigest digest = MessageDigest.getInstance("SHA-256");
                    byte[] hashBytes = digest.digest((data + previousHash).getBytes());
                    StringBuilder hexString = new StringBuilder();
                    for (byte hashByte : hashBytes) {
                        hexString.append(String.format("%02x", hashByte));
                    }
                    return hexString.toString();
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public String getHash() {
                return hash;
            }

            public String getPreviousHash() {
                return previousHash;
            }
        }

        class Blockchain {
            ArrayList<Block> blockchain = new ArrayList();

            public void addBlock(String data) {
                String previousHash = blockchain.isEmpty() ? "0" : blockchain.get(blockchain.size() - 1).getHash();
                blockchain.add(new Block(data, previousHash));
            }

            public boolean isValid() {
                for (int i = 1; i < blockchain.size(); i++) {
                    Block currentBlock = blockchain.get(i);
                    Block previousBlock = blockchain.get(i - 1);
                    if (!currentBlock.getHash().equals(currentBlock.calculateHash()) || !currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                        return false;
                    }
                }
                return true;
            }
        }
        Blockchain blockchain = new Blockchain();
        blockchain.addBlock("Transaction 1");
        blockchain.addBlock("Transaction 2");

        System.out.println("Blockchain validity: " + blockchain.isValid());
    }
}

