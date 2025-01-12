SELECT a.BOOK_ID,  b.AUTHOR_NAME,  DATE_FORMAT(a.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
from BOOK a
join AUTHOR b
on a.AUTHOR_ID = b.AUTHOR_ID
where CATEGORY = '경제'
order by a.PUBLISHED_DATE;