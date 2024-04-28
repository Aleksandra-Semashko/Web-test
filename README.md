# Web_test
<h2>Проект Итогового модуля 36 Skillfactory</h2> 
<p> 28 автоматизированных тестов (23 позитивных/5 негативных) главной страницы Skillfactory.ru
<br> Тесты составлены с помощью Selenium IDE и содержат следующие <strong>команды</strong> :
<ul> 
  <li><strong>Open</strong> - Открывает URL-адрес</li>
  <li><strong>Select Window</strong> - выбирает всплывающее окно с помощью локатора окон</li>
  <li><strong>Store Window Handle</strong> - сохраняет дескриптор текущей страницы</li>
  <li><strong>Set Window Size</strong> - установливает размер окна браузера</li>
  <li><strong>Close</strong> - закрывает окно браузера</li>
  <li><strong>Select Frame</strong> - выбор фрейма в текущем окне</li>
  <li><strong>Run script</strong> - Создает новый тег «script» в теле текущего тестового окна и добавляет указанный текст в тело команды. (использовался для прокрутки интерфейса действием -scroll) </li>
  <li><strong>Mouse Over</strong> - имитирует наведение мышки</li>
  <li><strong>Mouse Out</strong> - имитирует снятие мышки с объекта</li>
  <li><strong>Mouse down at</strong> - имитирует пользователя, нажимая левую кнопку мыши в указанном месте на указанном элементе</li>
  <li><strong>Mouse up at</strong> - имитирует событие, которое происходит, когда пользователь отпускает кнопку мыши в указанном месте</li>
  <li><strong>Mouse move at</strong> - имитирует зажим кнопки с удержанием</li>
  <li><strong>Click</strong> - щелчок по ссылке, кнопке, флажку или переключателю</li>
  <li><strong>Type</strong> - устанавливает значение поля ввода, аналогичное действию ввода пользователя</li>
  <li><strong>Double click</strong> - двойной щелчок на веб-элементе на основе указанного элемента</li>
</ul>
<h2>Сценарии</h2>
<table>
<tr><th><b>Номер</b></th><th><b>Название</b></th><th><b>Шаги</b></th><th><b>Ожидаемый результат</b></th><th><b>Статус</b></th></tr>
<tr><th>SK1</th><th>Выпадающее меню курсов</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Навести на выпадающее меню "Онлайн-курсы"</li><li>Навести на курс Тестирование</li><li>Нажать на курс</li><li>Перейти на страницу Тестирования</li></ul></th><th>Выбираемый курс должен подсветиться и перевести на страницу Тестирования</th><th>Pass</th></tr>
<tr><th>SK2</th><th>Возврат на главную страницу по Лого</th><th><ul><li>Открыть страницу https://skillfactory.ru/courses/testirovanie</li><li>Нажать на Лого Skillfactory в левом верхнем углу</li><li>Вернуться на главную страницу</li></ul></th><th>По нажатию на Лого пользователь возвращается на главную страницу</th><th>Pass</th></tr>
<tr><th>SK3</th><th>Кнопка "Все курсы"</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до кнопки "Все курсы"</li><li>Нажать на конпку "Все курсы"</il></ul></th><th>Кнопка ведет на https://skillfactory.ru/courses</th><th>Pass</th></tr>
<tr><th>SK4</th><th>Отправка сообщения в чат поддержки</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Нажать на иконку чата в правом нижнему углу</li><li>Нажать на кнопку "Написать"</li><li>В поле "Введите сообщение" написать "Привет"</li><li>Отправить сообщение</li></ul></th><th>Пользователю удается иницировать перепуску в чате</th><th>Pass</th></tr>
<tr><th>SK5</th><th>Выбор курса в меню "Учим IT профессии"</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до "Учим IT профессии"</li><li>Навести на курс IT-специалист с нуля</li><li>Нажать на курс</li><li>Перейти на страницу https://skillfactory.ru/it-specialist-proforientaciya</li></ul></th><th>Выбираемый курс должен подсветиться и перевести на страницу IT профессий</th><th>Pass</th></tr>
<tr><th>SK6</th><th>Кнопка "Смотреть все профессии"</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до "Учим IT профессии"</li><li>Нажать на кнопку "Смотреть все профессии"</li><li>Перейти на страницу https://skillfactory.ru/courses</li></ul></th><th>Пользователь должен быть переведен на страницу Всех курсов</th><th>Pass</th></tr>
<tr><th>SK7</th><th>Кнопка выбора программы</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до секции про высшее образование</li><li>Нажать на кнопку "Выбрать программу"</li><li>Перейти на страницу https://new.skillfactory.ru/vyssheye-obrazovaniye?utm_source=skillfactory</li></ul></th><th>Пользоавтель должен быть на переведен на страницу о высшем образовании</th><th>Pass</th></tr>
<tr><th>SK8</th><th>Кнопка "Участвовать"</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до секции про "IT-рентген"</li><li>Нажать на кнопку "Участвовать"</li><li>Перейти на страницу https://free.skillfactory.ru/itrentgen</li></ul></th><th>Пользователь должен быть переведен на страницу IT-рентген</th><th>Pass</th></tr>
<tr><th>SK9</th><th>Ссылка на курс тестировщика из проекта</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до партнерских програм</li><li>Нажать на курс "Тестировщика-автоматизатора"</li><li>Перейти на страницу https://skillfactory.ru/qa-engineer-python-testirovshchik-programmnogo-obespecheniya</li></ul></th><th>Пользователю открывается страница посвященная курсу тестирования</th><th>Fail</th></tr>
<tr><th>SK10</th><th>Карусель отзывов</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до отзывов</li><li>Прокликать карусель до упора и обратно</li></ul></th><th>Пользователь может пролистать все отзывы и вернуться к первому</th><th>Pass</th></tr>
<tr><th>SK11</th><th>Карусель бесплатных материалов</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Бесплатных материалов</li><li>Прокликать карусель до упора и обратно</li></ul></th><th>Пользователь может пролистать все материалы и вернуться к первому</th><th>Pass</th></tr>
<tr><th>SK12</th><th>Кнопка "Участвовать" в меню бесплатных материалов</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Бесплатных материалов</li><li>Нажать на кнопку "Участвовать"</li></ul></th><th>Пользователь переводится по клику на релевантную ссылку</th><th>Pass</th></tr>
<tr><th>SK13</th><th>Кнопка "Смотреть все материалы"</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Бесплатных материалов</li><li>Нажать на кнопку "смотреть все материалы"</li></ul></th><th>Пользоваетель оказывается на странице https://Skillfactory.ru/free=events</th><th>Pass</th></tr>
<tr><th>SK14</th><th>Переход на оферту</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Центра карьеры</li><li>Нажать на оферту</li></ul></th><th>Пользователя переводят на страницу https://skillfactory.ru/refund-money</th><th>Pass</th></tr>
<tr><th>SK15</th><th>Карусель историй студентов</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Историй студентов</li>Прокликать карусель до упора и обратно</li></ul></th><th>Пользователь может пролистать все истории и вернуться к первой</th><th>Pass</th></tr>
<tr><th>SK16</th><th>Кнопка "Читать историю"</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Историй студентов</li><li>Нажать на кнопку "Читать историю"</li></ul></th><th>Пользователю открывается релевантная история</th><th>Pass</th></tr>
<tr><th>SK17</th><th>Карусель преподавателей</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Преподавателей</li>Прокликать карусель до упора и обратно</li></ul></th><th>Пользователь может пролистать всех перподавателей и вернуться к первому</th><th>Pass</th></tr>
<tr><th>SK18</th><th>Переход в медиа</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до Skillfactory Media</li><li>Нажать на "Перейти в Медиа"</li></ul></th><th>Пользователь оказывается на странице https://blog.skillfactory.ru/?_ga=2.223144731.1482213307.1690916313-215108554.1686124528</th><th>Pass</th></tr>
<tr><th>SK19</th><th>Кнопка "Читать" в секции СМИ</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до "О нас пишут СМИ"</li><li>Нажать на кнопку "Читать"</li></ul></th><th>Пользователю открывается в новом окне статья релевантного источника о Skillfactory</th><th>Pass</th></tr>
<tr><th>SK20</th><th>Отправка формы контактов</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до формы заявки</li><li>Ввести имя</li><li>Ввести почту</li><li>Ввести номер телефона</li><li>Нажать отправить</li></ul></th><th>Форма отправляется и пользователю показывается нотификация, что с ним свяжутся</th><th>Pass</th></tr>
<tr><th>SK21</th><th>Указать email без @</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до формы заявки</li><li>Ввести имя</li><li>Ввести почту без символа @</li><li>Ввести номер телефона</li><li>Нажать отправить</li></ul></th><th>Форма не отправляется, поле почты подсвечивает ошибку</th><th>Pass</th></tr>
<tr><th>SK22</th><th>Указать специальные симфола в поле имени</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до формы заявки</li><li>Ввести имя ~!@#$%^&*()_+{}|:”>?<Ё!”№;%:?*()_+/Ъ,/.,;’[]\|</li><li>Ввести почту</li><li>Ввести номер телефона</li><li>Нажать отправить</li></ul></th><th>Форма не отправляется, поле Имя подсвечивает ошибку</th><th>Pass</th></tr>
<tr><th>SK23</th><th>Указать номер с недостаточным числом цифр</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до формы заявки</li><li>Ввести имя</li><li>Ввести почту</li><li>Ввести номер телефона с меньшим числом значений</li><li>Нажать отправить</li></ul></th><th>Форма не отправляется, поле номера телефона подсвечивает ошибку</th><th>Pass</th></tr>
<tr><th>SK24</th><th>Переход на Положение о персональных данных</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до формы заявки</li><li>Нажать на положение о персональных данных</li></ul></th><th>Открывается страница https://skillfactory.ru/position_of_user_personal_data</th><th>Pass</th></tr>
<tr><th>SK25</th><th>Подписаться</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до футера</li><li>Нажать на поле "Почта"</li><li>Ввести email</li><li>Нажать Подписаться</li></ul></th><th>Email отправляется, появляется нотификация об успехе отправки</th><th>Pass</th></tr>
<tr><th>SK26</th><th>Нажать подписаться без указания email</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до футера</li><li>Нажать на поле "Почта"</li><li>Ввести пробел</li><li>Нажать Подписаться</li></ul></th><th>Подсвечивается поле и выводится информация, что оно обязательно к заполнению</th><th>Pass</th></tr>
<tr><th>SK27</th><th>XSS attack в поле подписки</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до футера</li><li>Нажать на поле "Почта"</li><li>Ввести <script>alert("I hacked this!")</script></li><li>Нажать Подписаться</li></ul></th><th>Подсвечивается поле и выводится информация, о некорректном email</th><th>Pass</th></tr> 
<tr><th>SK28</th><th>Перейти в телеграм по иконке телеграма</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до футера</li><li>Нажать на иконку Telegram</li></ul></th><th>Пользователю открывается интерфейс мессенджера Telegram</th><th>Pass</th></tr>
</table>
<h2> Баг-репорт</h2>
<table>
  <tr><th><b>Номер</b></th><th><b>Название</b></th><th><b>Шаги</b></th><th><b>Ожидаемый результат</b></th><th><b>Фактический результат</b></th></tr>
  <tr><th>Bug-SK9</th><th>Ссылка на курс тестировщика из проекта</th><th><ul><li>Открыть окно https://Skillfactory.ru</li><li>Промотать интерфейс ниже до партнерских програм</li><li>Нажать на курс "Тестировщика-автоматизатора"</li></ul></th><th>Пользователю открывается страница посвященная курсу тестирования https://skillfactory.ru/qa-engineer-python-testirovshchik-programmnogo-obespecheniya</th><th>Пользователю открывается страница посвященная курсу "Белый хакер" https://skillfactory.ru/cyber-security-etichnij-haker</th></tr>
</table>
