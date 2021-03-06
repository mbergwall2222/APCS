/**
 * Person class
 * Matthew Bergwall
 * 10/4/2017
 */
public class Person {
 public String name;
 public int inches;
 public int age;
 
 /** Constructor with name */
 public Person(String n) {
   name = n;
   inches = 0;
   age = 0;
 }
 
 /** Constructor with all attr */
 public Person(String n, int i, int a) {
  name = n;
  inches = i;
  age = a;
 }
 
 /** Returns name */
 public String getName() {
  return name; 
 }
 
 /** Returns height */
 public int getInches() {
  return inches; 
 }
 
 /** Returns age */
 public int getAge() {
  return age; 
 }
 
 /** Change value of name */
 public void changeName(String n) {
  name = n; 
 }
  
 /** Change value of height */
 public void changeInches(int i) {
  inches = i;
 }
 
 /** Change value of age */
 public void changeAge(int a) {
  age = a; 
 }
 
 /** Convert height to feet and inches */
 public String inchesToFeet(){
   int feet = inches/12;
   int inch = inches%12;
   return feet + " feet and " + inch + " inches";
 }
 
 public int yearsTo100() {
   return 100-age;
 }
 
 public int toDogYears() {
   return age*7;
 }
 /** Returns string value */
 public String toString() {
  return name + " is " + inches + " inches tall and " + age + " years old."; 
 }
  
}