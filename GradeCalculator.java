����   @ {
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter student name: 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String; # Enter marks for 5 subjects:
  % &  println   ( ) * makeConcatWithConstants (I)Ljava/lang/String;
  , - . nextInt ()I@      @V�     @T      @Q�     @N       : 
--- Result ---  < ) = &(Ljava/lang/String;)Ljava/lang/String;  (  @ ) A (D)Ljava/lang/String;  C ) D (C)Ljava/lang/String; F GradeCalculator Code LineNumberTable LocalVariableTable this LGradeCalculator; main ([Ljava/lang/String;)V i I grade C args [Ljava/lang/String; sc Ljava/util/Scanner; studentName Ljava/lang/String; marks [I total average D StackMapTable S ` java/lang/String Y 
SourceFile GradeCalculator.java BootstrapMethods f
 g h i ) j $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; l Subject :  n 
Student:  p Total Marks:  r 
Average:  t Grade:  InnerClasses w %java/lang/invoke/MethodHandles$Lookup y java/lang/invoke/MethodHandles Lookup ! E           G   /     *� �    H        I        J K   	 L M  G    	   ߻ Y� 	� L�
N6� � +� M� "� $6� )� `� '  � -+� +O-.`6����� /o9 1�� 
A6� 7 3�� 
B6� ' 5�� 
C6�  7�� 
D6� F6� 9� $� ,� ;  � $� � >  � $� � ?  � $� � B  � $�    H   ^        	       '  0  ?  G  P  V  _  o    �  �  �   � ! � " � # � $ � % I   z  * , N O  l  P Q  |  P Q  �  P Q  �  P Q    � R S    � T U   � V W   � X Y   � Z O  _ � [ \  � < P Q  ]   9 � * 	 ^  _ a     � +  ^  _ a  � �   b    c d      e  k e  m e  o e  q e  s u   
  v x z 