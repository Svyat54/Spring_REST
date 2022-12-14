package com.example.demo.RestServer.controller;

import com.example.demo.RestServer.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
@RestController
public class QuoteController {
        private Quote[] quotesList() {
            Quote[] list = new Quote[36];
            //                              0                   1               2
            list[0] = new Quote("wisdom", "Лев Толстой", "Менее всего просты люди желающие казаться простыми.");
            list[1] = new Quote("wisdom", "Мартин Лютер Кинг", "Если человек не нашёл, за что может умереть, он не способен жить.");
            list[2] = new Quote("wisdom", "Лао-Цзы", "Если кто-то причинил тебе зло, не мсти. Сядь на берегу реки, и вскоре ты увидишь, как мимо тебя проплывает труп твоего врага.");
            list[3] = new Quote("wisdom", "Бернард Шоу", "Мой способ шутить – это говорить правду. На свете нет ничего смешнее.");
            list[4] = new Quote("wisdom", "Индира Ганди", "История – самый лучший учитель, у которого самые плохие ученики.");
            list[5] = new Quote("wisdom", "Аристотель", "Мышление – верх блаженства и радость жизни, доблестнейшее занятие человека.");
            list[6] = new Quote("love", "Мать Тереза", "Чем больше любви, мудрости, красоты, доброты вы откроете в самом себе, тем больше вы заметите их в окружающем мире.");
            list[7] = new Quote("love", "Майкл Джексон", "Некоторые люди проводят жизнь в поисках любви вне их самих... Пока любовь в моём сердце, она повсюду.");
            list[8] = new Quote("love", "Софи Лорен", "Фантазия мужчины – лучшее оружие женщины.");
            list[9] = new Quote("love", "Коко Шанель", "Есть люди, у которых есть деньги, и есть богатые люди.");
            list[10] = new Quote("love", "Стив Джобс", "Быть самым богатым человеком на кладбище для меня не важно… Ложиться спать и говорить себе, что сделал действительно нечто прекрасное, — вот что важно!");
            list[11] = new Quote("love", "Фредерик Бегбедер", "Вы знаете, чем отличаются богатые и бедные? Бедные продают наркотики, чтобы покупать себе найки, в то время, как богатые продают эти найки, чтобы покупать себе наркотики.");
            list[12] = new Quote("knowledge", "Альберт Эйнштейн", "Чем умнее человек, тем легче он признает себя дураком.");
            list[13] = new Quote("knowledge", "Рембрандт", "Внимай лишь одному учителю – Природе.");
            list[14] = new Quote("knowledge", "Исаак Ньютон", "То, что мы знаем, это капля, а то, что мы не знаем, это океан.");
            list[15] = new Quote("knowledge", "Максим Горький", "Знание — это абсолютная ценность нашего времени…");
            list[16] = new Quote("knowledge", "Публиций Сир", "Человек совершал бы меньше ошибок, если бы знал, чего именно он не знает.");
            list[17] = new Quote("knowledge", "Цицерон", "Знание, далекое от справедливости, заслуживает скорее названия ловкости, чем мудрости.");
            list[18] = new Quote("success", "Теодор Рузвельт", "Никогда не ошибается тот, кто ничего не делает.");
            list[19] = new Quote("success", "Генри Форд", "Если тебе тяжело, значит ты поднимаешься в гору. Если тебе легко, значит ты летишь в пропасть.");
            list[20] = new Quote("success", "Зигмунд Фрейд", "Единственный человек, с которым вы должны сравнивать себя, – это вы в прошлом. И единственный человек, лучше которого вы должны быть, – это вы сейчас.");
            list[21] = new Quote("success", "Наполеон Бонапарт", "Дай человеку власть, и ты узнаешь, кто он.");
            list[22] = new Quote("success", "Алан Рикман", "Я серьёзно отношусь к своей работе, а это возможно только при несерьёзном отношении к собственной персоне.");
            list[23] = new Quote("success", "Томас Эдиссон", "Многие люди не представляют, как близко они подобрались к успеху в тот момент, когда сдались");
            list[24] = new Quote("art", "Джон Леннон", "Музыка заводит сердца так, что пляшет и поёт тело. А есть музыка, с которой хочется поделиться всем, что наболело.");
            list[25] = new Quote("art", "Михаил Булгаков", "Невозможность писать для меня равносильна погребению заживо...");
            list[26] = new Quote("art", "Василий Кандинский", "Необходимо, чтобы художник, кроме глаза, воспитывал и свою душу.");
            list[27] = new Quote("art", "Константин Станиславский", "Любите искусство в себе, а не себя в искусстве.");
            list[28] = new Quote("art", "Дени Дидро", "Искусство заключается в том, чтобы найти необыкновенное в обыкновенном и обыкновенное в необыкновенном.");
            list[29] = new Quote("art", "Оскар Уайлд", "Лондонские туманы не существовали, пока их не открыло искусство.");
            list[30] = new Quote("life", "Майя Плисецкая", "Характер – это и есть судьба.");
            list[31] = new Quote("life", "Стивен Хокинг", "Перспектива рано умереть заставила меня понять, что жизнь стоит того, чтобы её прожить.");
            list[32] = new Quote("life", "Александр Солженицын", "Когда-нибудь не страшно умереть – страшно умереть вот сейчас.");
            list[33] = new Quote("life", "Владислав Островский", "Научить людей ценить жизнь» — с этой задачей лучше всего справляется смерть.");
            list[34] = new Quote("life", "Эдвард Мунк", "Из моих останков вырастут цветы, и я буду в них — это и есть вечность!");
            list[35] = new Quote("life", "Джо Аберкромби", "Когда кто-то слишком долго ходит между жизнью и смертью, он начинает чувствовать себя живым, лишь когда смерть дышит ему в затылок.");

            return list;
        }

        private LinkedList<Quote> quotesByCategory(String category, Quote[] quotes){
            LinkedList<Quote> list = new LinkedList<>();
            for(Quote q : quotes){
                if(q.getCategory().equals(category)) {
                    list.add(q);
                }
            }
            return list;
        }

        @GetMapping("/randomQuote")
        //5
        public String randomQuote() {
            Quote[] list = quotesList();
            int index = (int) (Math.random() * list.length);
            return list[index].getQuote() + " (" + list[index].getAuthor() + ").";
        }

        @GetMapping("/QuoteBC")
        //6
        public String randomQuote(@RequestParam(value = "category", defaultValue = "wisdom") String category) {
            Quote[] list = quotesList();
            int index = (int) (Math.random() * 6);
            return quotesByCategory(category, list).get(index).getQuote() + " ("
                    + quotesByCategory(category, list).get(index).getAuthor() + ").";
        }
    }

