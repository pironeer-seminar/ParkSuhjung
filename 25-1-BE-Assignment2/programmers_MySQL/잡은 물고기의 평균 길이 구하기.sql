select round(avg(if(length is null,10,length)),2) as AVERAGE_LENGTH
from fish_info;