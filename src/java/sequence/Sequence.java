/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

/**
 *
 * @author LENOVO
 */
public class Sequence {
   private final String id;
   private final String prefix;
   private final String suffix;
   
   public Sequence(String id,String prefix,String suffix){
       this.id=id;
       this.prefix=prefix;
       this.suffix=prefix;
   }
   
   public String getId(){
       return id;
   }
   
   public String getPrefix(){
       return prefix;
   }
   
   public String getSuffix(){
       return suffix;
   }
}
