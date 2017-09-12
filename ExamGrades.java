class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  /* TEMPLATE:
   * Fields:
   * this.grades  -- double
   * 
   */
  
  // arr[] -> double
  // Accepts this array of grades
  // Returns the highest grade among the array of grades
  
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
