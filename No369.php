<?php
    $N = trim(fgets(STDIN));
    $sum_number = array_sum(explode(" ", trim(fgets(STDIN))));
    $wrong_answer = trim(fgets(STDIN));
    
    echo $sum_number - $wrong_answer;
    
?>