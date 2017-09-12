class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  // TODO design a function that returns the highest grade
  
  /* TEMPLATE:
   * this.grades
   * 
   */
  // arr[] -> double
  // Accepts this array of grades
  // Returns the highest grade
  double highest(double grade[]){
    double max = 0;
    for(int i = 0; i < grade.length; i++){
      if(grade[i] > max){
        max = grade[i];
      }
    }
    return max;
  }
}