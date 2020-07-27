package com.barcke.rsa.pojo;

/**
  *                  ,;,,;
  *                ,;;'(    社
  *      __      ,;;' ' \   会
  *   /'  '\'~~'~' \ /'\.)  主
  * ,;(      )    /  |.     义
  *,;' \    /-.,,(   ) \    码
  *     ) /       ) / )|    农
  *     ||        ||  \)     
  *     (_\       (_\
  *
  * @projectName rsa-body-spring-boot
  * @className KeyPair
  * @author Barcke
  * @date 2020/7/27 16:44
  * @version 1.0
  * @slogan: 源于生活 高于生活
  * @description: 
  **/
public class KeyInfo {
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    private String privateKey;
    private String publicKey;

}