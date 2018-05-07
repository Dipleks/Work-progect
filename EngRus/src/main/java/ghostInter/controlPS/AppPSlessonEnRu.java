package ghostInter.controlPS;

import java.util.HashMap;
import java.util.Map;

public class AppPSlessonEnRu
{
    private Map<Integer, String> appPSfileEn = new HashMap<>();
    private Map<Integer, String> appPSfileRu = new HashMap<>();

    public Map<Integer, String> getAppPSfileEn() {
        getStrEn();
        return appPSfileEn;
    }
    public Map<Integer, String> getAppPSfileRu() {
        getStrRu();
        return appPSfileRu;
    }

    private Map<Integer, String> getStrEn(){

        Runnable runnable = new Runnable()
        {
            @Override
            public void run() {
                Runnable runnable1 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(0,"I work here");
                        appPSfileEn.put(1,"I study");
                        appPSfileEn.put(2,"I understand");
                        appPSfileEn.put(3,"I understand you");
                        appPSfileEn.put(4,"I know it");
                        appPSfileEn.put(5,"I know it very well");
                        appPSfileEn.put(6,"I live in Russia");
                        appPSfileEn.put(7,"I speak English");
                        appPSfileEn.put(8,"I go to school");
                        appPSfileEn.put(9,"I go to work");
                        appPSfileEn.put(10,"I have a brother");
                        appPSfileEn.put(11,"I have an idea");
                        appPSfileEn.put(12,"I have a sister");
                        appPSfileEn.put(13,"We understand you");
                        appPSfileEn.put(14,"I have a car");
                        appPSfileEn.put(15,"I think so");
                        appPSfileEn.put(16,"I see it");
                        appPSfileEn.put(17,"I want it");
                        appPSfileEn.put(18,"I remember it");
                        appPSfileEn.put(19,"I remember it very well");
                        appPSfileEn.put(20,"We speak English");
                        appPSfileEn.put(21,"You know it");
                        appPSfileEn.put(22,"You see it");
                        appPSfileEn.put(23,"They help me");
                        appPSfileEn.put(24,"They go to work");
                        appPSfileEn.put(25,"We remember it");
                        appPSfileEn.put(26,"You speak English very well");
                        appPSfileEn.put(27,"We live here");
                        appPSfileEn.put(28,"I live in this city");
                        appPSfileEn.put(29,"We live in this county");
                    }
                };
                runnable1.run();
                Runnable runnable2 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(30,"I study there");
                        appPSfileEn.put(31,"It really happens");
                        appPSfileEn.put(32,"We want it");
                        appPSfileEn.put(33,"You work very hard");
                        appPSfileEn.put(34,"They study very hard");
                        appPSfileEn.put(35,"I feel happy");
                        appPSfileEn.put(36,"He lives there");
                        appPSfileEn.put(37,"She feels happy");
                        appPSfileEn.put(38,"It helps me");
                        appPSfileEn.put(39,"He also works here");
                        appPSfileEn.put(40,"He thinks so");
                        appPSfileEn.put(41,"He lives in this house");
                        appPSfileEn.put(42,"She remembers it");
                        appPSfileEn.put(43,"She lives in this place");
                        appPSfileEn.put(44,"She lives in that place");
                        appPSfileEn.put(45,"She speaks English very well");
                        appPSfileEn.put(46,"It really helps me");
                        appPSfileEn.put(47,"It looks interesting");
                        appPSfileEn.put(48,"It seems interesting");
                        appPSfileEn.put(49,"He reads in English");
                        appPSfileEn.put(50,"She reads English books");
                        appPSfileEn.put(51,"It looks strange");
                        appPSfileEn.put(52,"He knows it");
                        appPSfileEn.put(53,"She sees this mistake");
                        appPSfileEn.put(54,"He sees that mistake");
                        appPSfileEn.put(55,"It happens");
                        appPSfileEn.put(56,"He wants more");
                        appPSfileEn.put(57,"She wants more practice");
                        appPSfileEn.put(58,"He often plays computer games");
                        appPSfileEn.put(59,"She feels so happy");
                    }
                };
                runnable2.run();
                Runnable runnable3 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(60,"He does it every day");
                        appPSfileEn.put(61,"She goes to school");
                        appPSfileEn.put(62,"He goes to work");
                        appPSfileEn.put(63,"He often goes to the cinema");
                        appPSfileEn.put(64,"She often goes to the park");
                        appPSfileEn.put(65,"She does it very well");
                        appPSfileEn.put(66,"He has a house");
                        appPSfileEn.put(67,"She has a car");
                        appPSfileEn.put(68,"He has a dog");
                        appPSfileEn.put(69,"She has a cat");
                        appPSfileEn.put(70,"He has money");
                        appPSfileEn.put(71,"He has an offer");
                        appPSfileEn.put(72,"She watches TV");
                        appPSfileEn.put(73,"He teaches English");
                        appPSfileEn.put(74,"He misses you");
                        appPSfileEn.put(75,"He always finishes his work on time");
                        appPSfileEn.put(76,"She usually relaxes at home");
                        appPSfileEn.put(77,"He tries to do it");
                        appPSfileEn.put(78,"She tries to learn English");
                        appPSfileEn.put(79,"He tries to find a job");
                        appPSfileEn.put(80,"He sometimes plays computer games");
                        appPSfileEn.put(81,"She has interesting ideas");
                        appPSfileEn.put(82,"This lesson seems interesting");
                        appPSfileEn.put(83,"These lessons seem very useful");
                        appPSfileEn.put(84,"This lesson helps me");
                        appPSfileEn.put(85,"These lessons help me");
                        appPSfileEn.put(86,"Your lessons really help");
                        appPSfileEn.put(87,"My brother wants it");
                        appPSfileEn.put(88,"My sister lives there");
                        appPSfileEn.put(89,"My parents know it");
                    }
                };
                runnable3.run();
                Runnable runnable4 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(90,"My friend has a car");
                        appPSfileEn.put(91,"My boss knows everything");
                        appPSfileEn.put(92,"My boss usually reads all the documents");
                        appPSfileEn.put(93,"My boss usually checks all the information");
                        appPSfileEn.put(94,"I understand everything");
                        appPSfileEn.put(95,"Our mother thinks the same");
                        appPSfileEn.put(96,"Their ideas seem so interesting");
                        appPSfileEn.put(97,"His father has a car");
                        appPSfileEn.put(98,"Her brother often says it");
                        appPSfileEn.put(99,"He has a company");
                        appPSfileEn.put(100,"Its profit seems so big");
                        appPSfileEn.put(101,"My girlfriend feels happy");
                        appPSfileEn.put(102,"My girlfriend loves me very much");
                        appPSfileEn.put(103,"My friend always supports me");
                        appPSfileEn.put(104,"My friends always support me");
                        appPSfileEn.put(105,"My friends sometimes say it");
                        appPSfileEn.put(106,"My best friend always helps me");
                        appPSfileEn.put(107,"My teacher usually comes to work early");
                        appPSfileEn.put(108,"My father usually comes home late");
                        appPSfileEn.put(109,"I see its success");
                        appPSfileEn.put(110,"I have a family");
                        appPSfileEn.put(111,"We often do it");
                        appPSfileEn.put(112,"You always say it");
                        appPSfileEn.put(113,"They often go to the cinema");
                        appPSfileEn.put(114,"He knows this thing");
                        appPSfileEn.put(115,"She sees this mistake");
                        appPSfileEn.put(116,"It looks so interesting");
                        appPSfileEn.put(117,"I see this mistake");
                        appPSfileEn.put(118,"I see these mistakes");
                        appPSfileEn.put(119,"I understand that person");
                    }
                };
                runnable4.run();
                Runnable runnable5 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(120,"I understand those people");
                        appPSfileEn.put(121,"He goes to school");
                        appPSfileEn.put(122,"My friend thinks so");
                        appPSfileEn.put(123,"My friend thinks the same");
                        appPSfileEn.put(124,"Our boss knows it");
                        appPSfileEn.put(125,"All your ideas seem very interesting");
                        appPSfileEn.put(126,"Their offer seems really strange");
                        appPSfileEn.put(127,"His idea seems very interesting");
                        appPSfileEn.put(128,"Her words seem strange");
                        appPSfileEn.put(129,"I want to be happy");
                        appPSfileEn.put(130,"I want this thing");
                        appPSfileEn.put(131,"I want this computer");
                        appPSfileEn.put(132,"I want this dress");
                        appPSfileEn.put(133,"I want a new computer");
                        appPSfileEn.put(134,"I want a good car");
                        appPSfileEn.put(135,"I want a new flat/apartment");
                        appPSfileEn.put(136,"I really want it");
                        appPSfileEn.put(137,"I want to do it");
                        appPSfileEn.put(138,"She wants to do it");
                        appPSfileEn.put(139,"I want to know it");
                        appPSfileEn.put(140,"I really want to know it");
                        appPSfileEn.put(141,"I want to improve my English");
                        appPSfileEn.put(142,"I want to speak English better");
                        appPSfileEn.put(143,"I want to speak English without mistakes");
                        appPSfileEn.put(144,"I want to improve my grammar");
                        appPSfileEn.put(145,"I want to speak English correctly");
                        appPSfileEn.put(146,"I want to learn English fast");
                        appPSfileEn.put(147,"I want to have a good job");
                        appPSfileEn.put(148,"I want to have a good car");
                        appPSfileEn.put(149,"She wants to do it right now");
                    }
                };
                runnable5.run();
                Runnable runnable6 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(150,"He wants to buy this thing");
                        appPSfileEn.put(151,"I want to speak English fluently");
                        appPSfileEn.put(152,"My friend wants to check it one more time");
                        appPSfileEn.put(153,"My friend wants to check it again");
                        appPSfileEn.put(154,"My friend wants to live abroad");
                        appPSfileEn.put(155,"I want to go abroad");
                        appPSfileEn.put(156,"My parents want to live in another place");
                        appPSfileEn.put(157,"I really want to thank you");
                        appPSfileEn.put(158,"Thanks a lot");
                        appPSfileEn.put(159,"I like it");
                        appPSfileEn.put(160,"I like English");
                        appPSfileEn.put(161,"I like your lessons");
                        appPSfileEn.put(162,"I like this idea");
                        appPSfileEn.put(163,"I like this thing");
                        appPSfileEn.put(164,"I like this video");
                        appPSfileEn.put(165,"I like this playlist");
                        appPSfileEn.put(166,"I like this channel");
                        appPSfileEn.put(167,"I like this method");
                        appPSfileEn.put(168,"I really like it");
                        appPSfileEn.put(169,"I really like these lessons");
                        appPSfileEn.put(170,"I also like it");
                        appPSfileEn.put(171,"I also like this channel");
                        appPSfileEn.put(172,"I like it, too");
                        appPSfileEn.put(173,"I like this channel, too");
                        appPSfileEn.put(174,"We like");
                        appPSfileEn.put(175,"You like it");
                        appPSfileEn.put(176,"They like it");
                        appPSfileEn.put(177,"He likes it");
                        appPSfileEn.put(178,"She likes it");
                        appPSfileEn.put(179,"I see you like it");
                    }
                };
                runnable6.run();
                Runnable runnable7 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(180,"I know they like it");
                        appPSfileEn.put(181,"She likes this place");
                        appPSfileEn.put(182,"He likes this dress");
                        appPSfileEn.put(183,"My friend likes this hotel");
                        appPSfileEn.put(184,"I would like");
                        appPSfileEn.put(185,"I would like a cup of coffee");
                        appPSfileEn.put(186,"I’d like to become a businessman");
                        appPSfileEn.put(187,"I’d like a cup of tea");
                        appPSfileEn.put(188,"I’d like to drink a cup of coffee");
                        appPSfileEn.put(189,"I’d like to drink a cup of tea");
                        appPSfileEn.put(190,"I’d like to do it");
                        appPSfileEn.put(191,"I’d like to know English very well");
                        appPSfileEn.put(192,"I’d like to visit this place");
                    }
                };
                runnable7.run();
                //Отрицания
                Runnable runnable8 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(193,"I don’t know");
                        appPSfileEn.put(194,"We don’t understand");
                        appPSfileEn.put(195,"You don’t try to learn English");
                        appPSfileEn.put(196,"They don’t help me");
                        appPSfileEn.put(197,"I agree with you");
                        appPSfileEn.put(198,"I don’t agree with you");
                        appPSfileEn.put(199,"I don’t like it");
                        appPSfileEn.put(200,"I don’t want to study there");
                        appPSfileEn.put(201,"I want to discuss it");
                        appPSfileEn.put(202,"I don’t want to discuss it");
                        appPSfileEn.put(203,"I don’t want to do it right now");
                        appPSfileEn.put(204,"I don’t want to do it later");
                        appPSfileEn.put(205,"I don’t want to say it");
                        appPSfileEn.put(206,"I don’t want to tell you this thing");
                        appPSfileEn.put(207,"I don’t want to tell you about this problem");
                        appPSfileEn.put(208,"I don’t want to think about it");
                        appPSfileEn.put(209,"He doesn’t know it");
                        appPSfileEn.put(210,"She doesn’t want to discuss it");
                        appPSfileEn.put(211,"It doesn’t help me");
                        appPSfileEn.put(212,"It doesn’t seem strange");
                        appPSfileEn.put(213,"It doesn’t work");
                        appPSfileEn.put(214,"I don’t want to know it");
                        appPSfileEn.put(215,"He doesn’t work there");
                        appPSfileEn.put(216,"He doesn’t work here");
                        appPSfileEn.put(217,"She doesn’t remember it");
                        appPSfileEn.put(218,"He doesn’t want to read these books");
                        appPSfileEn.put(219,"He wants to read those books");
                        appPSfileEn.put(220,"He doesn’t have this information");
                        appPSfileEn.put(221,"I don’t want to play computer games");
                        appPSfileEn.put(222,"He doesn’t know this person");
                    }
                };
                runnable8.run();
                Runnable runnable9 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(223,"He doesn’t want to try to find a good job");
                        appPSfileEn.put(224,"He doesn’t try to find a good job");
                        appPSfileEn.put(225,"I don’t want to live in this country");
                        appPSfileEn.put(226,"My friend doesn’t think so");
                        appPSfileEn.put(227,"We don’t want to live in another place");
                        appPSfileEn.put(228,"It doesn’t seem useful");
                        appPSfileEn.put(229,"I don’t want to think about it");
                        appPSfileEn.put(230,"I don’t understand these people");
                        appPSfileEn.put(231,"He doesn’t have a car");
                        appPSfileEn.put(232,"I don’t want to drink");
                        appPSfileEn.put(233,"I don’t want to live in this city");
                        appPSfileEn.put(234,"This thing doesn’t interest me");
                        appPSfileEn.put(235,"These things don’t attract me");
                        appPSfileEn.put(236,"That thing doesn’t seem interesting");
                        appPSfileEn.put(237,"Those things don’t seem strange");
                        appPSfileEn.put(238,"Those lessons don’t seem useful");
                        appPSfileEn.put(239,"These lessons seem very useful");
                        appPSfileEn.put(240,"That method doesn’t help");
                        appPSfileEn.put(241,"This method really helps");
                        appPSfileEn.put(242,"My brother doesn’t want to think about his future");
                        appPSfileEn.put(243,"My sister doesn’t know this person");
                        appPSfileEn.put(244,"My friends don’t recommend this hotel");
                        appPSfileEn.put(245,"His son doesn’t want to become a doctor");
                        appPSfileEn.put(246,"Her daughter doesn’t want to study there");
                        appPSfileEn.put(247,"His parents don’t feel happy");
                        appPSfileEn.put(248,"This person doesn’t try to change his life");
                        appPSfileEn.put(249,"My boss doesn’t see her");
                        appPSfileEn.put(250,"My partner doesn’t know him");
                        appPSfileEn.put(251,"My friend and I don’t call them");
                        appPSfileEn.put(252,"Our teacher doesn’t believe us");
                    }
                };
                runnable9.run();
                Runnable runnable10 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(253,"He thinks money doesn’t bring people happiness");
                        appPSfileEn.put(254,"She thinks money doesn’t make people happy");
                        appPSfileEn.put(255,"I want to make you happy");
                        appPSfileEn.put(256,"I need this information");
                        appPSfileEn.put(257,"I need to do it");
                        appPSfileEn.put(258,"I need to check it");
                        appPSfileEn.put(259,"I need to study harder");
                        appPSfileEn.put(260,"I need to learn English");
                        appPSfileEn.put(261,"I need to correct this mistake");
                        appPSfileEn.put(262,"I need to see her");
                        appPSfileEn.put(263,"I need to call him");
                        appPSfileEn.put(264,"I need to call them");
                        appPSfileEn.put(265,"I need it");
                        appPSfileEn.put(266,"We need it");
                        appPSfileEn.put(267,"You need it");
                        appPSfileEn.put(268,"They need it");
                        appPSfileEn.put(269,"He needs it");
                        appPSfileEn.put(270,"She needs it");
                        appPSfileEn.put(271,"I really need English");
                        appPSfileEn.put(272,"I really need it");
                        appPSfileEn.put(273,"I really need to know English");
                        appPSfileEn.put(274,"I really need your lessons");
                        appPSfileEn.put(275,"I need to solve this problem");
                        appPSfileEn.put(276,"I really need you");
                        appPSfileEn.put(277,"She needs to correct these mistakes");
                        appPSfileEn.put(278,"He needs to find a good job");
                        appPSfileEn.put(279,"You need to remember this rule");
                        appPSfileEn.put(280,"You need to remember it");
                        appPSfileEn.put(281,"I need to improve my English");
                        appPSfileEn.put(282,"I need to speak English without mistake");
                    }
                };
                runnable10.run();
                Runnable runnable11 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(283,"I need to speak English without any mistakes at all");
                        appPSfileEn.put(284,"My friend needs your help");
                        appPSfileEn.put(285,"My friend needs your advice");
                        appPSfileEn.put(286,"I need your advice");
                        appPSfileEn.put(287,"His father needs money");
                        appPSfileEn.put(288,"Your mother needs to work less");
                        appPSfileEn.put(289,"I need this thing");
                        appPSfileEn.put(290,"I agree with you");
                        appPSfileEn.put(291,"We support you");
                        appPSfileEn.put(292,"You know it better");
                        appPSfileEn.put(293,"They live in another country");
                        appPSfileEn.put(294,"He always pays for her");
                        appPSfileEn.put(295,"She agrees with you");
                        appPSfileEn.put(296,"It happens from time to time");
                        appPSfileEn.put(297,"He often goes to the cinema");
                        appPSfileEn.put(298,"She goes to work");
                        appPSfileEn.put(299,"He has so many problems");
                        appPSfileEn.put(300,"He has an interesting idea");
                        appPSfileEn.put(301,"She teaches Spanish");
                        appPSfileEn.put(302,"I don’t order food there");
                        appPSfileEn.put(303,"We don’t have any questions");
                        appPSfileEn.put(304,"You don’t understand us");
                        appPSfileEn.put(305,"They don’t believe him");
                        appPSfileEn.put(306,"She doesn’t tell me these things");
                        appPSfileEn.put(307,"He doesn’t speak Spanish");
                        appPSfileEn.put(308,"It doesn’t motivate me");
                        appPSfileEn.put(309,"His girlfriend know everything");
                        appPSfileEn.put(310,"Our teachers don’t explain it");
                        appPSfileEn.put(311,"Her boyfriend doesn’t know about this problem");
                    }
                };
                runnable11.run();

                //Вопросы
                Runnable runnable12 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(312,"Do you know it?");
                        appPSfileEn.put(313,"Do I make mistakes?");
                        appPSfileEn.put(314,"Do we show good results?");
                        appPSfileEn.put(315,"Do you understand me?");
                        appPSfileEn.put(316,"Do they agree with us?");
                        appPSfileEn.put(317,"Do you try to improve this result?");
                        appPSfileEn.put(318,"Do you work on your mistakes?");
                        appPSfileEn.put(319,"Do you have free time?");
                        appPSfileEn.put(320,"Do you support me?");
                        appPSfileEn.put(321,"Do you agree with me?");
                        appPSfileEn.put(322,"Do you remember it?");
                        appPSfileEn.put(323,"Do you remember everything?");
                        appPSfileEn.put(324,"Do you know about this problem?");
                        appPSfileEn.put(325,"Do you need help?");
                        appPSfileEn.put(326,"Do you need more money?");
                        appPSfileEn.put(327,"Do you need my advice?");
                        appPSfileEn.put(328,"Do you support this decision?");
                        appPSfileEn.put(329,"Do you want to study better?");
                        appPSfileEn.put(330,"Do you want to know your mistakes?");
                        appPSfileEn.put(331,"Do you need to solve this problem right now?");
                        appPSfileEn.put(332,"Do you like it?");
                        appPSfileEn.put(333,"Do you like this channel?");
                        appPSfileEn.put(334,"Do you like this song?");
                        appPSfileEn.put(335,"Do you like this idea?");
                        appPSfileEn.put(336,"Do you like classical music?");
                        appPSfileEn.put(337,"Do you often do it?");
                        appPSfileEn.put(338,"Do you often listen to music?");
                        appPSfileEn.put(339,"Do you often go there?");
                        appPSfileEn.put(340,"Do you often use the Internet?");
                        appPSfileEn.put(341,"Do you often go to the gym?");
                    }
                };
                runnable12.run();
                Runnable runnable13 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(342,"Do you often visit this place?");
                        appPSfileEn.put(343,"Do they often discuss it?");
                        appPSfileEn.put(344,"Do they do the same?");
                        appPSfileEn.put(345,"Do we have enough practice?");
                        appPSfileEn.put(346,"Do we have enough knowledge?");
                        appPSfileEn.put(347,"Does she think about it?");
                        appPSfileEn.put(348,"Does he live there?");
                        appPSfileEn.put(349,"Does it help you?");
                        appPSfileEn.put(350,"Does she teach English?");
                        appPSfileEn.put(351,"Does she tell him everything?");
                        appPSfileEn.put(352,"Does she ignore it?");
                        appPSfileEn.put(353,"Does he hate it?");
                        appPSfileEn.put(354,"Does he hate this thing?");
                        appPSfileEn.put(355,"Does he pay for it?");
                        appPSfileEn.put(356,"Does he look for a job?");
                        appPSfileEn.put(357,"Does he try to find a new job?");
                        appPSfileEn.put(358,"Does he want to work in another place?");
                        appPSfileEn.put(359,"Does she need to call him?");
                        appPSfileEn.put(360,"Does she need to come there?");
                        appPSfileEn.put(361,"Does she need to come to this place?");
                        appPSfileEn.put(362,"Does she often say it?");
                        appPSfileEn.put(363,"Does he often hear it?");
                        appPSfileEn.put(364,"Does she often listen to the radio?");
                        appPSfileEn.put(365,"Does he often watch TV?");
                        appPSfileEn.put(366,"Does she often use it?");
                        appPSfileEn.put(367,"Does it often happen?");
                        appPSfileEn.put(368,"Does it sometimes happen?");
                        appPSfileEn.put(369,"Does he like it?");
                        appPSfileEn.put(370,"Does she like it?");
                        appPSfileEn.put(371,"Does he like this project?");
                    }
                };
                runnable13.run();
                Runnable runnable14 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(372,"Does she like this profession?");
                        appPSfileEn.put(373,"Does it look strange?");
                        appPSfileEn.put(374,"Does it seem interesting?");
                        appPSfileEn.put(375,"Does it seem boring?");
                        appPSfileEn.put(376,"Does this lesson seem useful?");
                        appPSfileEn.put(377,"Do these lessons help you?");
                        appPSfileEn.put(378,"Does this channel seem very interesting?");
                        appPSfileEn.put(379,"Does this teacher explain everything very well?");
                        appPSfileEn.put(380,"Does this information seem useless?");
                        appPSfileEn.put(381,"Does this thing seem important?");
                        appPSfileEn.put(382,"Do these things seem unimportant?");
                        appPSfileEn.put(383,"Does this exam seem very difficult?");
                        appPSfileEn.put(384,"Does that test seem very easy?");
                        appPSfileEn.put(385,"Does his girlfriend understand it?");
                        appPSfileEn.put(386,"Does their boss know all the truth?");
                        appPSfileEn.put(387,"Do these students show excellent results?");
                        appPSfileEn.put(388,"Does this student show brilliant results?");
                        appPSfileEn.put(389,"Does that student make mistakes?");
                        appPSfileEn.put(390,"Do those students speak English correctly?");
                        appPSfileEn.put(391,"Does your friend like this idea?");
                        appPSfileEn.put(392,"Do your friends support you?");
                        appPSfileEn.put(393,"Does this exercise seem too easy?");
                        appPSfileEn.put(394,"Does this result depend on you?");
                        appPSfileEn.put(395,"Where do you live?");
                        appPSfileEn.put(396,"Where do you work?");
                        appPSfileEn.put(397,"Where do you go?");
                        appPSfileEn.put(398,"Where do they spend time together?");
                        appPSfileEn.put(399,"Why do you think so?");
                        appPSfileEn.put(400,"Why do you agree with him?");
                        appPSfileEn.put(401,"Why do you learn English?");
                    }
                };
                runnable14.run();
                Runnable runnable15 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(402,"What do you think about it?");
                        appPSfileEn.put(403,"What do you know?");
                        appPSfileEn.put(404,"What do you want to do? ");
                        appPSfileEn.put(405,"What do you need to do?");
                        appPSfileEn.put(406,"How do you find this idea?");
                        appPSfileEn.put(407,"How do you get to work?");
                        appPSfileEn.put(408,"How do you get there?");
                        appPSfileEn.put(409,"When do you feel happy?");
                        appPSfileEn.put(410,"When do you go to work?");
                        appPSfileEn.put(411,"When do you have free time?");
                        appPSfileEn.put(412,"What do you want to say?");
                        appPSfileEn.put(413,"What seems strange?");
                        appPSfileEn.put(414,"What do they want to tell you?");
                        appPSfileEn.put(415,"What helps you?");
                        appPSfileEn.put(416,"What really helps you?");
                        appPSfileEn.put(417,"Who do you know?");
                        appPSfileEn.put(418,"Who knows it?");
                        appPSfileEn.put(419,"Who do you support?");
                        appPSfileEn.put(420,"Who supports you?");
                        appPSfileEn.put(421,"What books do you read?");
                        appPSfileEn.put(422,"What English books do you read?");
                        appPSfileEn.put(423,"What music do you prefer?");
                        appPSfileEn.put(424,"What kind of books do you read?");
                        appPSfileEn.put(425,"What kind of computer games do they play?");
                        appPSfileEn.put(426,"What time do you get up?");
                        appPSfileEn.put(427,"What time do you go to bed?");
                        appPSfileEn.put(428,"How much money do you have with you?");
                        appPSfileEn.put(429,"How many friends do you have?");
                        appPSfileEn.put(430,"How often do you go there?");
                        appPSfileEn.put(431,"How often do you go to the gym?");
                    }
                };
                runnable15.run();
                Runnable runnable16 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(432,"How regularly do you learn English?");
                        appPSfileEn.put(433,"Where does he work?");
                        appPSfileEn.put(434,"Where does she study?");
                        appPSfileEn.put(435,"Where does she go?");
                        appPSfileEn.put(436,"Why does he complain so often?");
                        appPSfileEn.put(437,"Why does she refuse to pay?");
                        appPSfileEn.put(438,"Why does it happen again and again?");
                        appPSfileEn.put(439,"What does she say?");
                        appPSfileEn.put(440,"What does she tell him?");
                        appPSfileEn.put(441,"What does he want to add?");
                        appPSfileEn.put(442,"What does she try to do?");
                        appPSfileEn.put(443,"What does he need to change?");
                        appPSfileEn.put(444,"How does she test their knowledge?");
                        appPSfileEn.put(445,"How does it help you?");
                        appPSfileEn.put(446,"How does he support you?");
                        appPSfileEn.put(447,"When does it happen?");
                        appPSfileEn.put(448,"When does he feel happy?");
                        appPSfileEn.put(449,"What does he remember?");
                        appPSfileEn.put(450,"What does she want to add?");
                        appPSfileEn.put(451,"What helps you?");
                        appPSfileEn.put(452,"What interests you?");
                        appPSfileEn.put(453,"What worries you?");
                        appPSfileEn.put(454,"Who does it motivate?");
                        appPSfileEn.put(455,"Who motivates you?");
                        appPSfileEn.put(456,"Who does she love?");
                        appPSfileEn.put(457,"Who loves her?");
                        appPSfileEn.put(458,"Who does he support?");
                        appPSfileEn.put(459,"Who supports him?");
                        appPSfileEn.put(460,"What English books does he have?");
                        appPSfileEn.put(461,"What channels does he watch?");
                    }
                };
                runnable16.run();
                Runnable runnable17 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(462,"What kind of movies (films) does she watch?");
                        appPSfileEn.put(463,"She watches different movies!");
                        appPSfileEn.put(464,"What books does she prefer to read?");
                        appPSfileEn.put(465,"Which channel do you usually watch?");
                        appPSfileEn.put(466,"What channels does he usually watch?");
                        appPSfileEn.put(467,"Which drink does she prefer: tea or coffee?");
                        appPSfileEn.put(468,"What drinks does she prefer?");
                        appPSfileEn.put(469,"What time does he come to work?");
                        appPSfileEn.put(470,"What time does she leave home?");
                        appPSfileEn.put(471,"How much money does she pay?");
                        appPSfileEn.put(472,"How many dollars does he have?");
                        appPSfileEn.put(473,"How often does she go to the cinema?");
                        appPSfileEn.put(474,"How often does he go to the zoo?");
                        appPSfileEn.put(475,"How regularly does he do these exercises?");
                        appPSfileEn.put(476,"What do you do?");
                        appPSfileEn.put(477,"How long does it take you to get to work?");
                        appPSfileEn.put(478,"How long does it take him to get to this place?");
                        appPSfileEn.put(479,"What advice does she give you?");
                        appPSfileEn.put(480,"Where?");
                        appPSfileEn.put(481,"Why?");
                        appPSfileEn.put(482,"Who?");
                        appPSfileEn.put(483,"How?");
                        appPSfileEn.put(484,"When?");
                        appPSfileEn.put(485,"What?");
                        appPSfileEn.put(486,"Which?");
                        appPSfileEn.put(487,"Where does your father work?");
                        appPSfileEn.put(488,"Where do your parents live?");
                        appPSfileEn.put(489,"Why does your boss criticize it?");
                        appPSfileEn.put(490,"Why does your mother think so?");
                        appPSfileEn.put(491,"Why do your friends disagree with you?");
                    }
                };
                runnable17.run();
                Runnable runnable18 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileEn.put(492,"How does your sister feel?");
                        appPSfileEn.put(493,"How does your brother control it?");
                        appPSfileEn.put(494,"When does your father leave home?");
                        appPSfileEn.put(495,"When does this thing happen?");
                        appPSfileEn.put(496,"When do these things happen?");
                        appPSfileEn.put(497,"What do your friends usually order?");
                        appPSfileEn.put(498,"What does your boss usually promise?");
                        appPSfileEn.put(499,"What advice does your teacher give you?");
                        appPSfileEn.put(500,"What advice do your teachers give you?");
                        appPSfileEn.put(501,"What kind of examples does his teacher give?");
                        appPSfileEn.put(502,"How much free time does your business partner have?");
                        appPSfileEn.put(503,"How many English words does your friend want to know?");
                        appPSfileEn.put(504,"How often does this thing happen?");
                        appPSfileEn.put(505,"How often do these things happen?");
                        appPSfileEn.put(506,"How regularly does your boss check it?");
                        appPSfileEn.put(507,"How long does it take his son to get to work?");
                        appPSfileEn.put(508,"How long does it take his daughter to get to school?");
                        appPSfileEn.put(509,"What does your boss usually answer?");
                        appPSfileEn.put(510,"Does he do it with great pleasure?");
                        appPSfileEn.put(511,"Do you share his point of view?");
                        appPSfileEn.put(512,"What inspires you?");
                        appPSfileEn.put(513,"How often does your girlfriend mention it?");
                        appPSfileEn.put(514,"She often asks me about it!");
                        appPSfileEn.put(515,"Let's talk/speak about it!");
                    }
                };
                runnable18.run();
            }
        };
        runnable.run();
        return appPSfileEn;
    }
    private Map<Integer, String> getStrRu(){
        Runnable runnable = new Runnable()
        {
            @Override
            public void run() {
                Runnable runnable1 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(0,"Я работаю здесь");
                        appPSfileRu.put(1,"Я учусь");
                        appPSfileRu.put(2,"Я понимаю");
                        appPSfileRu.put(3,"Я понимаю тебя");
                        appPSfileRu.put(4,"Я знаю это");
                        appPSfileRu.put(5,"Я знаю это очень хорошо");
                        appPSfileRu.put(6,"Я живу в России");
                        appPSfileRu.put(7,"Я говорю по-английски");
                        appPSfileRu.put(8,"Я хожу в школу");
                        appPSfileRu.put(9,"Я хожу на работу");
                        appPSfileRu.put(10,"У меня есть брат");
                        appPSfileRu.put(11,"У меня есть идея");
                        appPSfileRu.put(12,"У меня есть сестра");
                        appPSfileRu.put(13,"Мы понимаем тебя");
                        appPSfileRu.put(14,"У меня есть машина");
                        appPSfileRu.put(15,"Я думаю так");
                        appPSfileRu.put(16,"Я вижу это");
                        appPSfileRu.put(17,"Я хочу это");
                        appPSfileRu.put(18,"Я помню это");
                        appPSfileRu.put(19,"Я помню это очень хорошо");
                        appPSfileRu.put(20,"Мы говорим по-английски");
                        appPSfileRu.put(21,"Ты знаешь это");
                        appPSfileRu.put(22,"Ты видишь это");
                        appPSfileRu.put(23,"Они помогают мне");
                        appPSfileRu.put(24,"Они ходят на работу");
                        appPSfileRu.put(25,"Мы помним это");
                        appPSfileRu.put(26,"Ты говоришь по-английски очень хорошо");
                        appPSfileRu.put(27,"Мы живем здесь");
                        appPSfileRu.put(28,"Я живу в этом городе");
                        appPSfileRu.put(29,"Мы живем в этой стране");
                    }
                };
                runnable1.run();
                Runnable runnable2 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(30,"Я учусь там");
                        appPSfileRu.put(31,"Это реально происходит");
                        appPSfileRu.put(32,"Мы хотим это");
                        appPSfileRu.put(33,"Ты работаешь очень усердно");
                        appPSfileRu.put(34,"Они учатся очень усердно");
                        appPSfileRu.put(35,"Я чувствую себя счастливым");
                        appPSfileRu.put(36,"Он живет там");
                        appPSfileRu.put(37,"Она чувствует себя счастливой");
                        appPSfileRu.put(38,"Это помогает мне");
                        appPSfileRu.put(39,"Он также работает здесь");
                        appPSfileRu.put(40,"Он думает так");
                        appPSfileRu.put(41,"Он живет в этом доме");
                        appPSfileRu.put(42,"Она помнит это");
                        appPSfileRu.put(43,"Она живет в этом месте");
                        appPSfileRu.put(44,"Она живет в том месте");
                        appPSfileRu.put(45,"Она говорит по-английски очень хорошо");
                        appPSfileRu.put(46,"Это реально помогает мне");
                        appPSfileRu.put(47,"Это выглядит интересно");
                        appPSfileRu.put(48,"Это кажется интересным");
                        appPSfileRu.put(49,"Он читает на Английском");
                        appPSfileRu.put(50,"Она читает Английские книги");
                        appPSfileRu.put(51,"Это выглядит странно");
                        appPSfileRu.put(52,"Он знает это");
                        appPSfileRu.put(53,"Она видит эту ошибку");
                        appPSfileRu.put(54,"Он видит ту ошибку");
                        appPSfileRu.put(55,"Это случается");
                        appPSfileRu.put(56,"Он хочет большего");
                        appPSfileRu.put(57,"Она хочет больше практики");
                        appPSfileRu.put(58,"Он часто играет в компьютерные игры");
                        appPSfileRu.put(59,"Она чувствует себя такой счастливой");
                    }
                };
                runnable2.run();
                Runnable runnable3 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(60,"Он делает это каждый день");
                        appPSfileRu.put(61,"Она ходит в школу");
                        appPSfileRu.put(62,"Он ходит на работу");
                        appPSfileRu.put(63,"Он часто ходит в кино");
                        appPSfileRu.put(64,"Она часто ходит в парк");
                        appPSfileRu.put(65,"Она делает это очень хорошо");
                        appPSfileRu.put(66,"У него есть дом");
                        appPSfileRu.put(67,"У нее есть машина");
                        appPSfileRu.put(68,"У него есть собака");
                        appPSfileRu.put(69,"У нее есть кошка");
                        appPSfileRu.put(70,"У него есть деньги");
                        appPSfileRu.put(71,"У него есть предложение");
                        appPSfileRu.put(72,"Она смотрит ТВ");
                        appPSfileRu.put(73,"Он припадает Английский");
                        appPSfileRu.put(74,"Он скучает по тебе");
                        appPSfileRu.put(75,"Он всегда заканчивает свою работу вовремя");
                        appPSfileRu.put(76,"Она обычно отдыхает дома");
                        appPSfileRu.put(77,"Он пытается сделать это");
                        appPSfileRu.put(78,"Она пытается выучить Английский");
                        appPSfileRu.put(79,"Он пытается найти работу");
                        appPSfileRu.put(80,"Он иногда играет в компьютерные игры");
                        appPSfileRu.put(81,"У нее есть интересные идеи");
                        appPSfileRu.put(82,"Этот урок кажется интересным");
                        appPSfileRu.put(83,"Эти уроки кажутся очень полезными");
                        appPSfileRu.put(84,"Этот урок помогает мне");
                        appPSfileRu.put(85,"Эти уроки помогают мне");
                        appPSfileRu.put(86,"Твои уроки реально помогают");
                        appPSfileRu.put(87,"Мой брат хочет это");
                        appPSfileRu.put(88,"Моя сестра живет там");
                        appPSfileRu.put(89,"Мои родители знают это");
                    }
                };
                runnable3.run();
                Runnable runnable4 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(90,"У моего друга есть машина");
                        appPSfileRu.put(91,"Мой босс знает все");
                        appPSfileRu.put(92,"Мой босс обычно читает все документы");
                        appPSfileRu.put(93,"Мой босс обычно проверяет всю информацию");
                        appPSfileRu.put(94,"Я понимаю все");
                        appPSfileRu.put(95,"Наша мама думает также");
                        appPSfileRu.put(96,"Их идеи кажутся такими интересными");
                        appPSfileRu.put(97,"У его отца есть машина");
                        appPSfileRu.put(98,"Её брат часто говорит это");
                        appPSfileRu.put(99,"У него есть компания");
                        appPSfileRu.put(100,"Её прибыль кажется такой большой");
                        appPSfileRu.put(101,"Моя девушка чувствует себя счастливой");
                        appPSfileRu.put(102,"Моя девушка любит меня очень сильно");
                        appPSfileRu.put(103,"Мой друг всегда поддерживает меня");
                        appPSfileRu.put(104,"Мои друзья всегда поддерживают меня");
                        appPSfileRu.put(105,"Мои друзья иногда говорят это");
                        appPSfileRu.put(106,"Мой лучший друг всегда помогает мне");
                        appPSfileRu.put(107,"Мой учитель обычно приходит на работу рано");
                        appPSfileRu.put(108,"Мой отец обычно приходит домой поздно");
                        appPSfileRu.put(109,"Я вижу её успех");
                        appPSfileRu.put(110,"У меня есть семья");
                        appPSfileRu.put(111,"Мы часто делаем это");
                        appPSfileRu.put(112,"Ты всегда говоришь это");
                        appPSfileRu.put(113,"Они часто ходят в кино");
                        appPSfileRu.put(114,"Он знает эту вещь");
                        appPSfileRu.put(115,"Она видит эту ошибку");
                        appPSfileRu.put(116,"Это выглядит таким интересным");
                        appPSfileRu.put(117,"Я вижу эту ошибку");
                        appPSfileRu.put(118,"Я вижу эти ошибки");
                        appPSfileRu.put(119,"Я понимаю того человека");
                    }
                };
                runnable4.run();
                Runnable runnable5 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(120,"Я понимаю тех людей");
                        appPSfileRu.put(121,"Он ходит в школу");
                        appPSfileRu.put(122,"Мой друг думает так");
                        appPSfileRu.put(123,"Мой друг думает так же");
                        appPSfileRu.put(124,"Наш босс знает это");
                        appPSfileRu.put(125,"Все твои идеи кажутся очень интересными");
                        appPSfileRu.put(126,"Их предложение кажется действительно странным");
                        appPSfileRu.put(127,"Его идея кажется очень интересной");
                        appPSfileRu.put(128,"Её слова кажутся странными");
                        appPSfileRu.put(129,"Я хочу быть счастливым");
                        appPSfileRu.put(130,"Я хочу эту вещь");
                        appPSfileRu.put(131,"Я хочу этот компьютер");
                        appPSfileRu.put(132,"Я хочу это платье");
                        appPSfileRu.put(133,"Я хочу новый компьютер");
                        appPSfileRu.put(134,"Я хочу хорошую машину");
                        appPSfileRu.put(135,"Я хочу новую квартиру");
                        appPSfileRu.put(136,"Я действительно хочу это");
                        appPSfileRu.put(137,"Я хочу сделать это");
                        appPSfileRu.put(138,"Она хочет сделать это");
                        appPSfileRu.put(139,"Я хочу знать это");
                        appPSfileRu.put(140,"Я реально хочу знать это");
                        appPSfileRu.put(141,"Я хочу улучшить свой английский");
                        appPSfileRu.put(142,"Я хочу говорить по-английски лучше");
                        appPSfileRu.put(143,"Я хочу говорить по-английски без ошибок");
                        appPSfileRu.put(144,"Я хочу улучшить свою грамматику");
                        appPSfileRu.put(145,"Я хочу говорить по-английски правильно");
                        appPSfileRu.put(146,"Я хочу выучить английский быстро");
                        appPSfileRu.put(147,"Я хочу иметь хорошую работу");
                        appPSfileRu.put(148,"Я хочу иметь хорошую машину");
                        appPSfileRu.put(149,"Она хочет сделать это прямо сейчас");
                    }
                };
                runnable5.run();
                Runnable runnable6 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(150,"Он хочет купить эту вещь");
                        appPSfileRu.put(151,"Я хочу говорить по-английски свободно");
                        appPSfileRu.put(152,"Мой друг хочет проверить это еще один раз");
                        appPSfileRu.put(153,"Мой друг хочет проверить это снова");
                        appPSfileRu.put(154,"Мой друг хочет жить за границей");
                        appPSfileRu.put(155,"Я хочу поехать за границу");
                        appPSfileRu.put(156,"Мои родители хотят жить в другом месте");
                        appPSfileRu.put(157,"Я действительно хочу поблагодарить тебя");
                        appPSfileRu.put(158,"Спасибо большое");
                        appPSfileRu.put(159,"Мне нравится это");
                        appPSfileRu.put(160,"Мне нравится Английский");
                        appPSfileRu.put(161,"Мне нравятся твои уроки");
                        appPSfileRu.put(162,"Мне нравится эта идея");
                        appPSfileRu.put(163,"Мне нравится эта вещь");
                        appPSfileRu.put(164,"Мне нравится это видео");
                        appPSfileRu.put(165,"Мне нравится этот плейлист");
                        appPSfileRu.put(166,"Мне нравится этот канал");
                        appPSfileRu.put(167,"Мне нравится этот метод");
                        appPSfileRu.put(168,"Мне реально нравится это");
                        appPSfileRu.put(169,"Мне действительно нравятся эти уроки");
                        appPSfileRu.put(170,"Мне также нравится это");
                        appPSfileRu.put(171,"Мне также нравится этот канал");
                        appPSfileRu.put(172,"Мне нравится это, так же");
                        appPSfileRu.put(173,"Мне нравится этот канал, так же");
                        appPSfileRu.put(174,"Нам нравится");
                        appPSfileRu.put(175,"Тебе нравится это");
                        appPSfileRu.put(176,"Им нравится это");
                        appPSfileRu.put(177,"Ему нравится это");
                        appPSfileRu.put(178,"Ей нравится это");
                        appPSfileRu.put(179,"Я вижу, тебе нравится это");
                    }
                };
                runnable6.run();
                Runnable runnable7 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(180,"Я знаю, им нравится это");
                        appPSfileRu.put(181,"Ей нравится это место");
                        appPSfileRu.put(182,"Ему нравится это платье");
                        appPSfileRu.put(183,"Моему другу нравится этот отель");
                        appPSfileRu.put(184,"Я хотел бы");
                        appPSfileRu.put(185,"Я хотел бы чашку кофе");
                        appPSfileRu.put(186,"Я хотел бы стать бизнесменом");
                        appPSfileRu.put(187,"Я хотел бы чашку чая");
                        appPSfileRu.put(188,"Я хотел бы выпить чашку кофе");
                        appPSfileRu.put(189,"Я хотел бы выпить чашку чая");
                        appPSfileRu.put(190,"Я хотел бы сделать это");
                        appPSfileRu.put(191,"Я хотел бы знать английский очень хорошо");
                        appPSfileRu.put(192,"Я хотел бы посетить это место");
                    }
                };
                runnable7.run();

                //Отрицания
                Runnable runnable8 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(193,"Я не знаю");
                        appPSfileRu.put(194,"Мы не понимаем");
                        appPSfileRu.put(195,"Ты не пытаешься выучить Английский");
                        appPSfileRu.put(196,"Они не помогают мне");
                        appPSfileRu.put(197,"Я согласен с тобой");
                        appPSfileRu.put(198,"Я не согласен с тобой");
                        appPSfileRu.put(199,"Мне не нравится это");
                        appPSfileRu.put(200,"Я не хочу учиться там");
                        appPSfileRu.put(201,"Я хочу обсудить это");
                        appPSfileRu.put(202,"Я не хочу обсуждать это");
                        appPSfileRu.put(203,"Я не хочу делать это прямо сейчас");
                        appPSfileRu.put(204,"Я не хочу делать это позже");
                        appPSfileRu.put(205,"Я не хочу говорить это");
                        appPSfileRu.put(206,"Я не хочу говорить тебе эту вещь");
                        appPSfileRu.put(207,"Я не хочу говорить тебе об этой проблеме");
                        appPSfileRu.put(208,"Я не хочу думать об этом");
                        appPSfileRu.put(209,"Он не знает это");
                        appPSfileRu.put(210,"Она не хочет обсуждать это");
                        appPSfileRu.put(211,"Это не помогает мне");
                        appPSfileRu.put(212,"Это не кажется странным");
                        appPSfileRu.put(213,"Это не работает");
                        appPSfileRu.put(214,"Я не хочу это знать");
                        appPSfileRu.put(215,"Он не работает там");
                        appPSfileRu.put(216,"Он не работает здесь");
                        appPSfileRu.put(217,"Она не помнит это");
                        appPSfileRu.put(218,"Он не хочет читать эти книги");
                        appPSfileRu.put(219,"Он хочет читать те книги");
                        appPSfileRu.put(220,"У него нет этой информации");
                        appPSfileRu.put(221,"Он не хочет играть в компьютерные игры");
                    }
                };
                runnable8.run();
                Runnable runnable9 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(222,"Он не знает этого человека");
                        appPSfileRu.put(223,"Он не хочет пытаться найти хорошую работу");
                        appPSfileRu.put(224,"Он не пытается найти хорошую работу");
                        appPSfileRu.put(225,"Я не хочу жить в этой стране");
                        appPSfileRu.put(226,"Мой друг не думает так");
                        appPSfileRu.put(227,"Мы не хотим жить в другом месте");
                        appPSfileRu.put(228,"Это не кажется полезным");
                        appPSfileRu.put(229,"Я не хочу думать об этом");
                        appPSfileRu.put(230,"Я не понимаю этих людей");
                        appPSfileRu.put(231,"У него нет машины");
                        appPSfileRu.put(232,"Я не хочу пить");
                        appPSfileRu.put(233,"Я не хочу жить в этом городе");
                        appPSfileRu.put(234,"Эта вещь не интересует меня");
                        appPSfileRu.put(235,"Эти вещи не привлекают меня");
                        appPSfileRu.put(236,"Та вещь не кажется интересной");
                        appPSfileRu.put(237,"Те вещи не кажутся странными");
                        appPSfileRu.put(238,"Те уроки не кажутся полезными");
                        appPSfileRu.put(239,"Эти уроки кажутся очень полезными");
                        appPSfileRu.put(240,"Тот метод не помогает");
                        appPSfileRu.put(241,"Этот метод реально помогает");
                        appPSfileRu.put(242,"Мой брат не хочет думать о своем будущем");
                        appPSfileRu.put(243,"Моя сестра не знает этого человека");
                        appPSfileRu.put(244,"Мои друзья не рекомендуют этот отель");
                        appPSfileRu.put(245,"Его сын не хочет стать доктором");
                        appPSfileRu.put(246,"Её дочь не хочет учиться там");
                        appPSfileRu.put(247,"Его родители не чувствуют себя счастливыми");
                        appPSfileRu.put(248,"Этот человек не пытается изменить свою жизнь");
                        appPSfileRu.put(249,"Мой босс не видит её");
                        appPSfileRu.put(250,"Мой партнер не знает его");
                        appPSfileRu.put(251,"Мы с моим другом не звоним им");
                        appPSfileRu.put(252,"Наш учитель не верит нам");
                    }
                };
                runnable9.run();
                Runnable runnable10 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(253,"Он думает деньги не приносят людям счастья");
                        appPSfileRu.put(254,"Она думает деньги не делают людей счастливыми");
                        appPSfileRu.put(255,"Я хочу сделать вас счастливыми");
                        appPSfileRu.put(256,"Мне нужна эта информация");
                        appPSfileRu.put(257,"Мне нужно сделать это");
                        appPSfileRu.put(258,"Мне нужно проверить это");
                        appPSfileRu.put(259,"Мне нужно учиться усердней");
                        appPSfileRu.put(260,"Мне нужно выучить Английский");
                        appPSfileRu.put(261,"Мне нужно исправить эту ошибку");
                        appPSfileRu.put(262,"Мне нужно увидеть её");
                        appPSfileRu.put(263,"Мне нужно позвонить ему");
                        appPSfileRu.put(264,"Мне нужно позвонить им");
                        appPSfileRu.put(265,"Мне нужно это");
                        appPSfileRu.put(266,"Нам нужно это");
                        appPSfileRu.put(267,"Тебе нужно это");
                        appPSfileRu.put(268,"Им нужно это");
                        appPSfileRu.put(269,"Ему нужно это");
                        appPSfileRu.put(270,"Ей нужно это");
                        appPSfileRu.put(271,"Мне реально нужен английский");
                        appPSfileRu.put(272,"Мне реально это нужно");
                        appPSfileRu.put(273,"Мне реально нужно знать Английский");
                        appPSfileRu.put(274,"Мне реально нужны твои уроки");
                        appPSfileRu.put(275,"Мне нужно решить эту проблему");
                        appPSfileRu.put(276,"Ты мне реально нужна");
                        appPSfileRu.put(277,"Ей нужно исправить эти ошибки");
                        appPSfileRu.put(278,"Ему нужно найти хорошую работу");
                        appPSfileRu.put(279,"Тебе нужно запомнить это правило");
                        appPSfileRu.put(280,"Тебе нужно запомнить это");
                        appPSfileRu.put(281,"Мне нужно улучшить свой Английский");
                        appPSfileRu.put(282,"Мне нужно говорить по-английски без ошибок");
                    }
                };
                runnable10.run();
                Runnable runnable11 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(283,"Мне нужно говорить по-английски вовсе без каких-либо ошибок");
                        appPSfileRu.put(284,"Моему другу нужна твоя помощь");
                        appPSfileRu.put(285,"Моему другу нужен твой совет");
                        appPSfileRu.put(286,"Мне нужен твой совет");
                        appPSfileRu.put(287,"Его отцу нужны деньги");
                        appPSfileRu.put(288,"Твоей маме нужно работать меньше");
                        appPSfileRu.put(289,"Мне нужна эта вещь");
                        appPSfileRu.put(290,"Я согласен с тобой");
                        appPSfileRu.put(291,"Мы поддерживаем тебя");
                        appPSfileRu.put(292,"Ты знаешь это лучше");
                        appPSfileRu.put(293,"Они живут в другой стране");
                        appPSfileRu.put(294,"Он всегда платит за неё");
                        appPSfileRu.put(295,"Она согласна с тобой");
                        appPSfileRu.put(296,"Это происходит время от времени");
                        appPSfileRu.put(297,"Он часто ходит в кино");
                        appPSfileRu.put(298,"Она ходит на работу");
                        appPSfileRu.put(299,"У него так много проблем");
                        appPSfileRu.put(300,"У него есть интересная идея");
                        appPSfileRu.put(301,"Она припадает Испанский");
                        appPSfileRu.put(302,"Я не заказываю еду там");
                        appPSfileRu.put(303,"У нас нет каких-либо вопросов");
                        appPSfileRu.put(304,"Ты не понимаешь нас");
                        appPSfileRu.put(305,"Они не верят ему");
                        appPSfileRu.put(306,"Она не говорит мне эти вещи");
                        appPSfileRu.put(307,"Он не говорит по-испански");
                        appPSfileRu.put(308,"Это не мотивирует меня");
                        appPSfileRu.put(309,"Его девушка все знает");
                        appPSfileRu.put(310,"Наши учителя не объясняют это");
                        appPSfileRu.put(311,"Её парень не знает об этой проблеме");
                    }
                };
                runnable11.run();

                //Вопросы
                Runnable runnable12 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(312,"Ты знаешь это?");
                        appPSfileRu.put(313,"Я делаю ошибки?");
                        appPSfileRu.put(314,"Мы показываем хорошие результаты?");
                        appPSfileRu.put(315,"Ты понимаешь меня?");
                        appPSfileRu.put(316,"Они согласны с нами?");
                        appPSfileRu.put(317,"Ты пытаешься улучшить этот результат?");
                        appPSfileRu.put(318,"Ты работаешь над своими ошибками?");
                        appPSfileRu.put(319,"У тебя есть свободное время?");
                        appPSfileRu.put(320,"Ты поддерживаешь меня?");
                        appPSfileRu.put(321,"Ты согласен со мной?");
                        appPSfileRu.put(322,"Ты помнишь это?");
                        appPSfileRu.put(323,"Ты все помнишь?");
                        appPSfileRu.put(324,"Ты знаешь об этой проблеме?");
                        appPSfileRu.put(325,"Тебе нужна помощь?");
                        appPSfileRu.put(326,"Тебе нужно больше денег?");
                        appPSfileRu.put(327,"Тебе нужен мой совет?");
                        appPSfileRu.put(328,"Ты поддерживаешь это решение?");
                        appPSfileRu.put(329,"Ты хочешь учиться лучше?");
                        appPSfileRu.put(330,"Ты хочешь знать свои ошибки?");
                        appPSfileRu.put(331,"Тебе нужно решить эту проблему прямо сейчас?");
                        appPSfileRu.put(332,"Тебе нравится это?");
                        appPSfileRu.put(333,"Тебе нравится этот канал?");
                        appPSfileRu.put(334,"Тебе нравится эта песня?");
                        appPSfileRu.put(335,"Тебе нравится эта идея?");
                        appPSfileRu.put(336,"Тебе нравится класическая музыка?");
                        appPSfileRu.put(337,"Ты часто делаешь это?");
                        appPSfileRu.put(338,"Ты часто слушаешь музыку?");
                        appPSfileRu.put(339,"Ты часто ходишь туда?");
                        appPSfileRu.put(340,"Ты часто пользуешся интернетом?");
                        appPSfileRu.put(341,"Ты часто ходишь в зал?");
                    }
                };
                runnable12.run();
                Runnable runnable13 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(342,"Ты часто посещаешь это место?");
                        appPSfileRu.put(343,"Они часто обсуждают это?");
                        appPSfileRu.put(344,"Они делают тоже самое?");
                        appPSfileRu.put(345,"У нас достаточно практики?");
                        appPSfileRu.put(346,"У нас достаточно знаний?");
                        appPSfileRu.put(347,"Она думает об этом?");
                        appPSfileRu.put(348,"Он живет там?");
                        appPSfileRu.put(349,"Это помогает тебе?");
                        appPSfileRu.put(350,"Она припадает английский?");
                        appPSfileRu.put(351,"Она говорит ему все?");
                        appPSfileRu.put(352,"Она игнорирует это?");
                        appPSfileRu.put(353,"Он ненавидит это?");
                        appPSfileRu.put(354,"Он ненавидит эту вещь?");
                        appPSfileRu.put(355,"Он платит за это?");
                        appPSfileRu.put(356,"Он ищет работу?");
                        appPSfileRu.put(357,"Он пытается найти новую работу?");
                        appPSfileRu.put(358,"Он хочет работать в другом месте?");
                        appPSfileRu.put(359,"Ей нужно позвонить ему?");
                        appPSfileRu.put(360,"Её нужно прийти туда?");
                        appPSfileRu.put(361,"Её нужно прийти в это место?");
                        appPSfileRu.put(362,"Она часто говорит это?");
                        appPSfileRu.put(363,"Он часто слышит это?");
                        appPSfileRu.put(364,"Она часто слушает радио?");
                        appPSfileRu.put(365,"Он часто смотрит ТВ?");
                        appPSfileRu.put(366,"Она часто пользуется этим?");
                        appPSfileRu.put(367,"Это часто происходит?");
                        appPSfileRu.put(368,"Это иногда случается? / Это случается иногда?");
                        appPSfileRu.put(369,"Ему нравится это?");
                        appPSfileRu.put(370,"Ей нравится это?");
                        appPSfileRu.put(371,"Ему нравится этот проект?");
                    }
                };
                runnable13.run();
                Runnable runnable14 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(372,"Ей нравится эта профессия?");
                        appPSfileRu.put(373,"Это выглядет странным?");
                        appPSfileRu.put(374,"Это кажется интересным?");
                        appPSfileRu.put(375,"Это кажется скучным?");
                        appPSfileRu.put(376,"Этот урок кажется полезным?");
                        appPSfileRu.put(377,"Эти уроки помогают тебе?");
                        appPSfileRu.put(378,"Этот канал кажется очень интересным?");
                        appPSfileRu.put(379,"Этот учитель очень хорошо объясняет все?");
                        appPSfileRu.put(380,"Эта информация кажется бесполезной?");
                        appPSfileRu.put(381,"Эта вещь кажется важной?");
                        appPSfileRu.put(382,"Эти вещи кажутся не важными?");
                        appPSfileRu.put(383,"Этот экзамен кажется очень сложным?");
                        appPSfileRu.put(384,"Тот тест кажется очень легким?");
                        appPSfileRu.put(385,"Его девушка понимает это?");
                        appPSfileRu.put(386,"Их босс знает всю правду?");
                        appPSfileRu.put(387,"Эти студенты показывают отличные результаты?");
                        appPSfileRu.put(388,"Этот студент показывает блестящие результаты?");
                        appPSfileRu.put(389,"Тот студент делает ошибки?");
                        appPSfileRu.put(390,"Те студенты говорят по-английски правильно?");
                        appPSfileRu.put(391,"Твоему другу нравиться эта идея?");
                        appPSfileRu.put(392,"Твои друзья поддерживают тебя?");
                        appPSfileRu.put(393,"Это упражнение кажется слишком легким?");
                        appPSfileRu.put(394,"Этот результат зависит от тебя?");
                        appPSfileRu.put(395,"Где ты живешь?");
                        appPSfileRu.put(396,"Где ты работаешь?");
                        appPSfileRu.put(397,"Куда ты идешь?");
                        appPSfileRu.put(398,"Где они проводят время вместе?");
                        appPSfileRu.put(399,"Почему ты думаешь так?");
                        appPSfileRu.put(400,"Почему ты согласен с ним?");
                        appPSfileRu.put(401,"Почему ты изучаешь английский?");
                    }
                };
                runnable14.run();
                Runnable runnable15 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(402,"Что ты думаешь об этом?");
                        appPSfileRu.put(403,"Что ты знаешь?");
                        appPSfileRu.put(404,"Что ты хочешь сделать?");
                        appPSfileRu.put(405,"Что тебе нужно сделать?");
                        appPSfileRu.put(406,"Как ты находишь эту идею?");
                        appPSfileRu.put(407,"Как ты добираешься на работу?");
                        appPSfileRu.put(408,"Как ты добираешься до туда?");
                        appPSfileRu.put(409,"Когда ты чувствуешь себя счастливой?");
                        appPSfileRu.put(410,"Когда ты идешь на работу?");
                        appPSfileRu.put(411,"Когда у тебя есть свободное время?");
                        appPSfileRu.put(412,"Что ты хочешь сказать?");
                        appPSfileRu.put(413,"Что кажется странным?");
                        appPSfileRu.put(414,"Что они хотят сказать тебе?");
                        appPSfileRu.put(415,"Что помогает тебе?");
                        appPSfileRu.put(416,"Что реально помогает тебе?");
                        appPSfileRu.put(417,"Кого ты знаешь?");
                        appPSfileRu.put(418,"Кто знает это?");
                        appPSfileRu.put(419,"Кого ты поддерживаешь?");
                        appPSfileRu.put(420,"Кто поддерживает тебя?");
                        appPSfileRu.put(421,"Какие книги ты читаешь?");
                        appPSfileRu.put(422,"Какие английские книги ты читаешь?");
                        appPSfileRu.put(423,"Какую музыку ты предпочитаешь?");
                        appPSfileRu.put(424,"Какого рода книги ты читаешь?");
                        appPSfileRu.put(425,"Какого рода компьютерные игры они играют?");
                        appPSfileRu.put(426,"В какое время ты встаешь?");
                        appPSfileRu.put(427,"В какое время ты ложишся спать?");
                        appPSfileRu.put(428,"Сколько денег у тебя с собой?");
                        appPSfileRu.put(429,"Сколько друзей у тебя?");
                        appPSfileRu.put(430,"Как часто ты ходишь туда?");
                        appPSfileRu.put(431,"Как часто ты ходишь в зал?");
                    }
                };
                runnable15.run();
                Runnable runnable16 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(432,"Как регулярно ты занимаешся английским?");
                        appPSfileRu.put(433,"Где он работает?");
                        appPSfileRu.put(434,"Где она учится?");
                        appPSfileRu.put(435,"Куда она ходит?");
                        appPSfileRu.put(436,"Почему он жалуется так часто?");
                        appPSfileRu.put(437,"Почему она отказывается платить?");
                        appPSfileRu.put(438,"Почему это происходит снова и снова?");
                        appPSfileRu.put(439,"Что она говорит?");
                        appPSfileRu.put(440,"Что она говорит ему?");
                        appPSfileRu.put(441,"Что он хочет добавить?");
                        appPSfileRu.put(442,"Что она пытается делать?");
                        appPSfileRu.put(443,"Что ему нужно изменить?");
                        appPSfileRu.put(444,"Как она тестирует их знания?");
                        appPSfileRu.put(445,"Как это помогает тебе?");
                        appPSfileRu.put(446,"Как он поддерживает тебя?");
                        appPSfileRu.put(447,"Когда это происходит?");
                        appPSfileRu.put(448,"Когда он чувствует себя счастливым?");
                        appPSfileRu.put(449,"Что он помнит?");
                        appPSfileRu.put(450,"Что она хочет добавить?");
                        appPSfileRu.put(451,"Что помогает тебе?");
                        appPSfileRu.put(452,"Что интересует тебя?");
                        appPSfileRu.put(453,"Что беспокоит тебя?");
                        appPSfileRu.put(454,"Кого это мотивирует?");
                        appPSfileRu.put(455,"Кто мотивирует тебя?");
                        appPSfileRu.put(456,"Кого она любит?");
                        appPSfileRu.put(457,"Кто любит её?");
                        appPSfileRu.put(458,"Кого он поддерживает?");
                        appPSfileRu.put(459,"Кто поддерживает его?");
                        appPSfileRu.put(460,"Какие Английские книги у него есть?");
                        appPSfileRu.put(461,"Какие каналы он смотрит?");
                    }
                };
                runnable16.run();
                Runnable runnable17 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(462,"Какого рода фильмы он смотрит?");
                        appPSfileRu.put(463,"Она смотрит различные фильмы!");
                        appPSfileRu.put(464,"Какие книги она предпочитает читать?");
                        appPSfileRu.put(465,"Какой канал ты обычно смотришь?");
                        appPSfileRu.put(466,"Какие каналы ты обычно смотришь?");
                        appPSfileRu.put(467,"Какой напиток она предпочитает: чай или коффе?");
                        appPSfileRu.put(468,"Какие напитки она предпочитает?");
                        appPSfileRu.put(469,"В какое время он приходит на работу?");
                        appPSfileRu.put(470,"В какое время она уходит из дома?");
                        appPSfileRu.put(471,"Сколько денег она платит?");
                        appPSfileRu.put(472,"Сколько у него долларов?");
                        appPSfileRu.put(473,"Как часто она ходит в кино?");
                        appPSfileRu.put(474,"Как часто он ходит в зоопарк?");
                        appPSfileRu.put(475,"Как регулярно он делает эти упражнения?");
                        appPSfileRu.put(476,"Что ты делаешь?");
                        appPSfileRu.put(477,"Как долго это знаимает у тебя добраться до работы?");
                        appPSfileRu.put(478,"Сколько по времени он добирается до этого места?");
                        appPSfileRu.put(479,"Какой совет она дает тебе?");
                        appPSfileRu.put(480,"Где? Куда?");
                        appPSfileRu.put(481,"Почему?");
                        appPSfileRu.put(482,"Кто? Кого?");
                        appPSfileRu.put(483,"Как?");
                        appPSfileRu.put(484,"Когда?");
                        appPSfileRu.put(485,"Что? Какой? Какая? Какие?");
                        appPSfileRu.put(486,"Какой? Какая? Какие? - ограниченый выбор 1-3");
                        appPSfileRu.put(487,"Где работает твой отец?");
                        appPSfileRu.put(488,"Где живут твои родители?");
                        appPSfileRu.put(489,"Почему твой босс критекует это?");
                        appPSfileRu.put(490,"Почему твоя мама думает так?");
                        appPSfileRu.put(491,"Почему твои друзья не соглашаются с тобой?");
                    }
                };
                runnable17.run();
                Runnable runnable18 = new Runnable()
                {
                    @Override
                    public void run() {
                        appPSfileRu.put(492,"Как чувствует твоя сестра?");
                        appPSfileRu.put(493,"Как твой брат контролирует это?");
                        appPSfileRu.put(494,"Когда твой отец уходит из дома?");
                        appPSfileRu.put(495,"Когда эта вещь происходит?");
                        appPSfileRu.put(496,"Когда эти вещи происходят?");
                        appPSfileRu.put(497,"Что твои друзья обычно заказывают?");
                        appPSfileRu.put(498,"Что обычно обещает твой босс?");
                        appPSfileRu.put(499,"Какой совет твоя учительница дает тебе?");
                        appPSfileRu.put(500,"Какие советы твои учителя дают тебе?");
                        appPSfileRu.put(501,"Какого рода примеры его учитель дает?");
                        appPSfileRu.put(502,"Как много совободного времени есть у твоего бизнес партнера?");
                        appPSfileRu.put(503,"Как много английских слов твой друг хочет знать?");
                        appPSfileRu.put(504,"Как часто эта вещь происходит?");
                        appPSfileRu.put(505,"Как часто происходят эти вещи?");
                        appPSfileRu.put(506,"Как регулярно твой босс проверяет это?");
                        appPSfileRu.put(507,"Сколько по времени занимает у его сына добраться до работы?");
                        appPSfileRu.put(508,"Сколько по времени занимает у его дочери добраться до школы?");
                        appPSfileRu.put(509,"Что твой босс обычно отвечает?");
                        appPSfileRu.put(510,"Он делает это с огромным удовольствием?");
                        appPSfileRu.put(511,"Ты разделяешь его точку зрения?");
                        appPSfileRu.put(512,"Что вдохновляет тебя?");
                        appPSfileRu.put(513,"Как часто твоя девушка упоминает это?");
                        appPSfileRu.put(514,"Она часто спрашивает меня об этом!");
                        appPSfileRu.put(515,"Давай поговорим об этом!");
                    }
                };
                runnable18.run();
            }
        };
        runnable.run();
        return appPSfileRu;
    }
}
