package de.cardGame.cards.generate;

import java.util.Random;

import de.cardGame.cards.Card;
import de.cardGame.gui.ProgressBarGUI;
import de.cardGame.main.CardGame;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class CardGenDe {

	public static void generateCards(boolean animation) {
		Card.German = true;
		String[] text = new String[74];
		String[] selectA = new String[74];
		String[] selectB = new String[74];
		String[] selectC = new String[74];
		String[] AudioFilePath = new String[74];
		int[] nextA = new int[74];
		int[] nextB = new int[74];
		int[] nextC = new int[74];
		boolean[] isOver = new boolean[74];
		boolean[] isBlank = new boolean[74];
		boolean[] isSonder = new boolean[74];

		for (int i = 0; i < 74; i++) {
			isSonder[i] = false;
			isOver[i] = false;
			isBlank[i] = false;
		}

		// Card 0
		text[0] = "Du lebst in einer kleinen Wohnung in deiner Stadt und hast einen schlecht bezahlten und langweiligen Job. Du hast ein paar Vorstellungsgespräche geführt und warst in allen erfolgreich. Du hast die Wahl zwischen";
		selectA[0] = "a) einer Verkaufsposition für ein Computerunternehmen. Es gibt keinen Vorschuss, aber das Unternehmen bietet eine 50%ige Provision auf alles, was du verkauft hast plus ein Auto.";
		selectB[0] = "b) einer schlecht bezahlten, aber sich lohnenden Arbeit, bei der du Menschen helfen kannst.";
		selectC[0] = "c) einer durchschnittlich bezahlten Stelle, bei der du deine Stadt verlassen musst.";
		nextA[0] = 1;
		nextB[0] = 2;
		nextC[0] = 3;
		AudioFilePath[0] = "Audio/Card_0/De_de/";

		// Card 1
		text[1] = "Du hast die Verkaufsposition gewählt. In den ersten Monaten warst du sehr erfolgreich und hast eine Menge Computer verkauft und dabei dreimal so viel Geld verdient wie früher. Dann war das Geschäft ruhig. Du entscheidest dich,";
		selectA[1] = "a) das gesparte Geld in deine eigene kleine Firma zu investieren.";
		selectB[1] = "b) von deinen Ersparnissen zu leben, bis das Geschäft wieder gut läuft.";
		selectC[1] = "c) dir einen neuen Job zu besorgen.";
		nextA[1] = 4;
		nextB[1] = 5;
		nextC[1] = 6;
		AudioFilePath[1] = "Audio/Card_1/De_de/";

		// Card 2
		text[2] = "Du hast den Job gewählt, bei dem du Menschen helfen kannst. Du hast das wirklich genossen und obwohl die Arbeit anfangs nicht sehr gut bezahlt wurde, bist du schnell befördert worden und hast viel Geld verdient. Du hast beschlossen, dir eine Unterkunft zu kaufen. Du hast dich entschieden,";
		selectA[2] = "a) eine moderne Wohnung, die sehr teuer ist, zu kaufen.";
		selectB[2] = "b) eine Wohnung im älteren Stil, die ziemlich billig ist, zu kaufen.";
		selectC[2] = "c) ein Haus, das günstig und schön, aber weit weg von deinem Arbeitsplatz ist, zu kaufen.";
		nextA[2] = 7;
		nextB[2] = 8;
		nextC[2] = 9;
		AudioFilePath[2] = "Audio/Card_2/De_de/";

		// Card 3
		text[3] = "Du hast dich entschieden, die Stadt zu verlassen. Als du am ersten Tag in der neuen Stadt ankamst, hat dich jemand überfallen und all deine Sachen gestohlen. Du bist zur Polizei gegangen, aber die konnte dir nicht helfen. Du hast dich entschieden,";
		selectA[3] = "a) nach Hause zurückzukehren.";
		selectB[3] = "b) dort zu bleiben und den neuen Job anzutreten.";
		selectC[3] = "c) dir einen zweiten Job zu suchen, um all die Dinge zurückzubekommen, die du bei dem Überfall verloren hast.";
		nextA[3] = 10;
		nextB[3] = 11;
		nextC[3] = 12;
		AudioFilePath[3] = "Audio/Card_3/De_de/";

		// Card 4
		text[4] = "Du hast dein Geld in eine kleine Firma investiert - aber die Firma ging pleite! Du hast all dein Geld verloren und musstest einen anderen Weg finden, etwas Geld zu verdienen. Du hast einen Job bekommen, aber der war wirklich langweilig und wieder nicht gut bezahlt. Du hast dich entschieden,";
		selectA[4] = "a) in eine andere Stadt zu ziehen in der Hoffnung, dass du dort Arbeit finden wirst.";
		selectB[4] = "b) dich weiterzubilden, um deine Chancen zu verbessern.";
		selectC[4] = "c) dir Geld zu leihen und eine andere Firma zu gründen.";
		nextA[4] = 13;
		nextB[4] = 14;
		nextC[4] = 15;
		AudioFilePath[4] = "Audio/Card_4/De_de/";
		// Card 5
		text[5] = "Du hast beschlossen, von deinen Ersparnissen zu leben, bis sich das Geschäft wieder verbessert. Irgendwann lief das Geschäft auch wieder und du hast noch einmal viel Geld verdient. Jetzt willst du etwas davon ausgeben! Also kaufst du";
		selectA[5] = "a) ein Boot.";
		selectB[5] = "b) ein Auto.";
		selectC[5] = "c) teure Schmuckstücke.";
		nextA[5] = 16;
		nextB[5] = 17;
		nextC[5] = 18;
		AudioFilePath[5] = "Audio/Card_5/De_de/";

		// Card 6
		text[6] = "Du hast dich entschieden, einen neuen Job zu suchen. Das war eine gute Idee - die neue Arbeit macht dir wirklich Spaß und du hast viele Freunde an deinem neuen Arbeitsplatz gefunden. Eines Tages bittet dich einer deiner neuen Freunde, ihm eine ziemlich große Summe Geld zu leihen. Du hast dich dazu entschieden,";
		selectA[6] = "a) abzulehnen und ihm das Geld nicht zu leihen.";
		selectB[6] = "b) ihm das Geld zu leihen.";
		selectC[6] = "c) ihm zu versprechen, das Geld zu leihen, aber ihm aus dem Weg zu gehen.";
		nextA[6] = 19;
		nextB[6] = 20;
		nextC[6] = 21;
		AudioFilePath[6] = "Audio/Card_6/De_de/";

		// Card 7
		text[7] = "Du hast eine moderne Wohnung gewählt, die ziemlich teuer war. Leider hast du dich verletzt und musst dir eine Auszeit nehmen, sodass du dir die Zahlungen für deine Wohnung nicht leisten kannst und diese verkaufen musst. Ein wirklich netter Mann/eine wirklich nette Frau kam, um die Wohnung zu besichtigen, und ihr habt euch sehr gut verstanden. Am nächsten Tag hat er/sie angerufen und ihr habt euch irgendwo verabredet. Du hast dich entschieden, ihn/sie:";
		selectA[7] = "a) in einem Restaurant zu treffen.";
		selectB[7] = "b) in einem Café zu treffen.";
		selectC[7] = "c) im Kino zu treffen.";
		nextA[7] = 22;
		nextB[7] = 23;
		nextC[7] = 24;
		AudioFilePath[7] = "Audio/Card_7/De_de/";

		// Card 8
		text[8] = "Du bist in die ältere Wohnung eingezogen und wohnst dort gerne. Ein Mann/eine Frau aus derselben Gegend hat angefangen, mit dir zu reden. Du findest ihn/sie nett und interessierst dich näher für ihn/sie. Ihr habt angefangen, auszugehen und wart beide glücklich. Eines Tages erzählt dir dieser Mann/diese Frau, dass er/sie die Stadt verlassen muss und für ein Jahr weg sein würde. Du hast beschlossen,";
		selectA[8] = "a) die Beziehung zu beenden.";
		selectB[8] = "b) ein Jahr auf ihn/sie zu warten.";
		selectC[8] = "c) mit umzuziehen und deinen Job aufzugeben, ohne zu wissen, ob du einen anderen Job finden wirst.";
		nextA[8] = 25;
		nextB[8] = 26;
		nextC[8] = 27;
		AudioFilePath[8] = "Audio/Card_8/De_de/";

		// Card 9
		text[9] = "Du hast dir den schönen und bezahlbaren, aber weit entfernten Ort ausgesucht. Du hast festgestellt, dass du dort zwar gerne wohnst, aber die Fahrt zur Arbeit und zurück jeden Tag fast drei Stunden dauert und du oft zu spät kommst. Dadurch hast du deinen Job verloren. Du hast dich entschlossen,";
		selectA[9] = "a) dir einen anderen Job in der Nähe deines Wohnortes zu suchen, auch wenn es dort sehr wenig Arbeit gibt.";
		selectB[9] = "b) dein Haus zu verkaufen, obwohl du gerade erst dorthin gezogen bist.";
		selectC[9] = "c) dein Haus an eine andere Person zu vermieten und näher an die Stadt zu ziehen, um leichter Arbeit finden zu können.";
		nextA[9] = 28;
		nextB[9] = 29;
		nextC[9] = 30;
		AudioFilePath[9] = "Audio/Card_9/De_de/";

		// Card 10
		text[10] = "Du bist nach Hause zurückgekehrt, und dieses Mal hattest du Glück – du hast einen neuen Job gefunden UND du hast dich in einen wunderbaren Menschen verliebt! Du triffst die Familie dieser Person, da du sie heiraten willst. Aber die Familie mag dich überhaupt nicht. Du hast dich entschieden,";
		selectA[10] = "a) trotzdem zu heiraten.";
		selectB[10] = "b) durchzubrennen.";
		selectC[10] = "c) zu heiraten, aber deinen Partner/deine Partnerin zu überzeugen, dass ihr beide aus dieser Stadt wegziehen solltet.";
		nextA[10] = 31;
		nextB[10] = 32;
		nextC[10] = 33;
		AudioFilePath[10] = "Audio/Card_10/De_de/";

		// Card 11
		text[11] = "Du hast dich entschieden, in der Stadt zu bleiben und deinen Job zu behalten. Du kennst niemanden. Also ist es schwierig, weil du kein Geld hast und dir etwas leihen musst. Du hast dich entschieden,";
		selectA[11] = "a) deinen neuen Chef zu bitten, dir etwas Geld zu leihen.";
		selectB[11] = "b) einen Arbeitskollegen zu bitten, dir etwas Geld zu leihen.";
		selectC[11] = "c) einen kleinen Geldbetrag von der Arbeit zu nehmen, aber alles zurückzuzahlen, wenn du bezahlt wirst.";
		nextA[11] = 34;
		nextB[11] = 35;
		nextC[11] = 36;
		AudioFilePath[11] = "Audio/Card_11/De_de/";

		// Card 12
		text[12] = "Du hast dich entschieden, einen zweiten Job zu suchen, um mehr Geld zu verdienen. Der zweite Job ist in einem Restaurant. Also kannst du wenigstens dort essen, bis du bezahlt wirst. Du hast dich mit einem anderen Kellner angefreundet. Eines Abends bittet dich der Kellner, ihm zu helfen, Geld aus der Kasse zu stehlen. Du hast dich dafür entschieden,";
		selectA[12] = "a) dich zu weigern, ihm zu helfen, aber nichts zu sagen.";
		selectB[12] = "b) dich zu weigern, ihm zu helfen, und es dem Chef zu sagen.";
		selectC[12] = "c) ihm zu helfen – du könntest das Geld gebrauchen und dann könntest du diesen Job kündigen.";
		nextA[12] = 37;
		nextB[12] = 38;
		nextC[12] = 39;
		AudioFilePath[12] = "Audio/Card_12/De_de/";

		// Card 13
		text[13] = "Du bist in eine große Stadt gezogen, wo du sofort einen Job und eine gute Wohnung gefunden hast. In der ersten Woche in deinem neuen Job hast du einen wirklich netten Mann/eine wirklich nette Frau kennengelernt, den/die du sehr magst. Allerdings bist du dir nicht sicher, ob er/sie auch an dir interessiert ist. Du hast dich dafür entschieden,";
		selectA[13] = "a) ihn/sie nach einem Date zu fragen.";
		selectB[13] = "b) zu warten, bis er/sie dich nach einem Date fragt.";
		selectC[13] = "c) nichts zu tun – du bist gerade erst in die Stadt gezogen und zu beschäftigt, um eine Romanze in deinem Leben zu haben.";
		nextA[13] = 40;
		nextB[13] = 41;
		nextC[13] = 42;
		AudioFilePath[13] = "Audio/Card_13/De_de/";

		// Card 14
		text[14] = "Du hast dich entschieden, dich weiterzubilden, um deine Chancen zu verbessern. Du hast dich in der Abendschule angemeldet. Dort hast du jemand ganz besonderen kennengelernt und dich in ihn/sie verliebt. Doch nach zwei Monaten hat er/sie mit dir Schluss gemacht und ist mit jemand anderem aus dem Kurs ausgegangen! Das hat dir das Herz gebrochen und du warst wütend. Du hast dich dazu entschieden,";
		selectA[14] = "a) den Kurs zu verlassen.";
		selectB[14] = "b) im Kurs zu bleiben und nichts zu tun.";
		selectC[14] = "c) einen Weg zu finden, dich an deinem Ex-Freund/deiner Ex-Freundin zu rächen.";
		nextA[14] = 43;
		nextB[14] = 44;
		nextC[14] = 45;
		AudioFilePath[14] = "Audio/Card_14/De_de/";

		// Card 15
		text[15] = "Du hast dir das Geld geliehen – aber dann kam eine Rezession und dein Geschäft ist untergegangen! Du bist in großen Schwierigkeiten. Du hast dich dazu entschlossen,";
		selectA[15] = "a) Insolvenz anzumelden.";
		selectB[15] = "b) in zwei Jobs zu arbeiten und zu versuchen, das Geld irgendwie zurückzuzahlen.";
		selectC[15] = "c) dein Haus niederzubrennen und das Versicherungsgeld zu kassieren, um deine Schulden zurückzubezahlen.";
		nextA[15] = 46;
		nextB[15] = 47;
		nextC[15] = 48;
		AudioFilePath[15] = "Audio/Card_15/De_de/";

		// Card 16
		text[16] = "Du hast ein Boot gekauft. Du bist sehr begeistert und hast drei Freunde für eine kleine Party auf dieses Boot mitgenommen. Doch dann brach ein Sturm aus und eine Monsterwelle warf das Boot um. Dein Freund ist verletzt und zu schwach, um Hilfe zu holen. Du hast dich entschieden,";
		selectA[16] = "a) allein zu schwimmen, um Hilfe zu holen. ";
		selectB[16] = "b) zu schwimmen und deinen Freund mitzunehmen, um Hilfe zu holen.";
		selectC[16] = "c) bei deinem Freund zu bleiben und auf Hilfe zu warten.";
		nextA[16] = 49;
		nextB[16] = 50;
		nextC[16] = 51;
		AudioFilePath[16] = "Audio/Card_16/De_de/";

		// Card 17
		text[17] = "Du hast dich entschieden, ein teures Auto zu kaufen. Unglücklicherweise hat es eine Woche nach dem Kauf jemand gestohlen und du hattest keine Versicherung dafür. Du warst sehr verärgert und deprimiert und hast versucht, dein Geld durch Glücksspiel zurückzugewinnen. Du bist in ein Casino gegangen und hast alle restlichen Ersparnisse (etwa 5000 €) auf";
		selectA[17] = "a) rot gesetzt.";
		selectB[17] = "b) schwarz gesetzt.";
		selectC[17] = "c) Nummer 7 gesetzt.";
		nextA[17] = 52;
		nextB[17] = 53;
		nextC[17] = 54;
		AudioFilePath[17] = "Audio/Card_17/De_de/";

		// Card 18
		text[18] = "Du hast ziemlich teuren Schmuck gekauft. Ein paar Monate später hast du ihn aus Versicherungsgründen schätzen lassen und festgestellt, dass die gekauften Schmuckstücke Sammlerstücke sind, die mindestens fünfmal so viel wert sind wie das, was du dafür bezahlt hast! Du hast dich entschieden,";
		selectA[18] = "a) den Schmuck zu verkaufen.";
		selectB[18] = "b) den Schmuck in einem Safe aufzubewahren.";
		selectC[18] = "c) die Schmuckstücke zu tragen oder sie jemandem zu geben, der sie trägt.";
		nextA[18] = 58;
		nextB[18] = 59;
		nextC[18] = 60;
		AudioFilePath[18] = "Audio/Card_18/De_de/";

		// Card 19
		text[19] = "Du hast dich geweigert, deinem Freund das Geld zu leihen, was gut war, denn in der nächsten Woche verließ er die Stadt, nachdem er viel Geld von der Arbeit gestohlen hatte! Du bist geblieben, wurdest befördert und hast dich sehr gut geschlagen. Aber ein Familienmitglied in deiner Heimatstadt ist sehr krank geworden. Also bist du zurückgekehrt, um dich darum zu kümmern. Als du nach Hause kamst, hast du dich entschieden, eine Wohnung zu kaufen.";
		nextA[19] = 7;
		isBlank[19] = true;
		AudioFilePath[19] = "Audio/Card_19/De_de/";

		// Card 20
		text[20] = "Du hast beschlossen, deinem Freund das Geld zu leihen. Leider hat er die Stadt in der nächsten Woche verlassen und du hast das Geld nie wieder gesehen. Du hast jetzt keine Ersparnisse mehr. Eines Tages bist du in ein Taxi gestiegen und hast eine Brieftasche mit einer großen Summe Geld auf dem Rücksitz gefunden. Du hast beschlossen,";
		selectA[20] = "a) die Brieftasche einschließlich des Geldes an den Besitzer zurückzugeben.";
		selectB[20] = "b) das Geld zu behalten, aber die Brieftasche dem Taxifahrer zu geben.";
		selectC[20] = "c) das Geld zu behalten und die Brieftasche wegzuwerfen.";
		nextA[20] = 61;
		nextB[20] = 62;
		nextC[20] = 63;
		AudioFilePath[20] = "Audio/Card_20/De_de/";

		// Card 21
		text[21] = "Du hast deinem Arbeitskollegen versprochen, ihm das Geld zu leihen, aber bist ihm dann immer wieder aus dem Weg gegangen. Irgendwann hat er aufgehört, dich um das Geld zu bitten, hat aber stattdessen einige schreckliche Lügen über dich im Büro verbreitet. Du warst daraufhin sehr unglücklich bei der Arbeit. Du hast dich entschieden,";
		selectA[21] = "a) zu versuchen, dafür zu sorgen, dass dein Kollege gefeuert wird.";
		selectB[21] = "b) deinen Job zu kündigen.";
		selectC[21] = "c) deinem Kollegen das Geld doch noch zu leihen.";
		nextA[21] = 64;
		nextB[21] = 65;
		nextC[21] = 20;
		AudioFilePath[21] = "Audio/Card_21/De_de/";

		// Card 22
		text[22] = "Du hast dich entschieden, deine Verabredung in einem Restaurant zu treffen. Ihr hattet ein schönes gemeinsames Abendessen und habt die Gesellschaft des anderen wirklich genossen. Aber am Ende des Abendessens, als es Zeit war, die Rechnung zu bezahlen, wurde dir klar, dass du nicht genug Geld hast, um das Essen zu bezahlen. Also hast du dich dafür entschieden,";
		selectA[22] = "a) zu versuchen, das Restaurant zu verlassen, ohne zu bezahlen.";
		selectB[22] = "b) dein Date zu bitten, für das Essen zu bezahlen.";
		selectC[22] = "c) dem Restaurant die Wahrheit zu sagen und anzubieten, für sie zu arbeiten, um das Essen zu bezahlen.";
		nextA[22] = 67;
		nextB[22] = 68;
		nextC[22] = 69;
		AudioFilePath[22] = "Audio/Card_22/De_de/";

		// Card 23
		text[23] = "Du hast dich entschieden, deine Verabredung in einem Café zu treffen. Du hast dort zwei Stunden gewartet, aber dein Date ist nie aufgetaucht. Du warst wirklich enttäuscht. Am nächsten Tag hast du deine Wohnung an eine andere Person verkauft und das dadurch erhaltene Geld in ein kleines Unternehmen investiert.";
		nextA[23] = 4;
		isBlank[23] = true;
		AudioFilePath[23] = "Audio/Card_23/De_de/";

		// Card 24
		text[24] = "Du hast dich entschieden, dein Date in einem Kino zu treffen. Während ihr den Film angeschaut habt, haben die Leute vor euch nicht aufgehört zu reden und zu lachen. Du hattest einen Streit mit ihnen und die Platzanweiserin im Kino hat euch alle aufgefordert, das Kino zu verlassen. Dein Date war wütend und ist abgehauen. Du bist allein auf der Straße zurückgeblieben. Du bist in ein Taxi gestiegen, um nach Hause zu fahren, als du eine Brieftasche mit einer großen Menge Geld entdeckt hast.";
		nextA[24] = 63;
		isBlank[24] = true;
		AudioFilePath[24] = "Audio/Card_24/De_de/";

		// Card 25
		text[25] = "Du hast dich entschieden, die Beziehung zu beenden. Doch nach einigen Monaten hast du deinen Freund/deine Freundin so sehr vermisst, dass du ihn/sie angerufen und gebeten hast, es sich noch einmal zu überlegen. Er/sie hat dir erzählt, dass er/sie gerade jemand anderen kennengelernt hat. Du warst todunglücklich und hast beschlossen, in eine andere Stadt zu ziehen.";
		nextA[25] = 3;
		isBlank[25] = true;
		AudioFilePath[25] = "Audio/Card_25/De_de/";

		// Card 26
		text[26] = "Du hast dich entschieden, noch ein Jahr zu warten. Du warst einsam und hast deinen Partner/deine Partnerin vermisst, aber du hattest das Gefühl, die richtige Entscheidung getroffen zu haben. Zwei Monate vor der geplanten Rückkehr nach Hause hat dein Partner/deine Partnerin dir jedoch geschrieben, dass er/sie eine andere Person kennengelernt hat und diese heiraten würde. Du warst so enttäuscht, dass du beschlossen hast, in eine andere Stadt zu ziehen.";
		nextA[26] = 3;
		isBlank[26] = true;
		AudioFilePath[26] = "Audio/Card_26/De_de/";

		// Card 27
		text[27] = "Du hast dich entschieden, mit deinem Partner/deiner Partnerin wegzugehen, deinen Job hinter dir zu lassen und nicht zu wissen, ob du einen anderen bekommen kannst. Du bist damit ein großes Risiko eingegangen...und es hat sich ausgezahlt. Du hast einen fantastischen Job gefunden, in dem du die Möglichkeit hast, zu reisen! Dein Chef möchte, dass du in einem der Büros an einem ausländischen Standort arbeitest. Du hast dich entschieden, drei Monate";
		selectA[27] = "a) auf einer heißen tropischen Insel zu arbeiten.";
		selectB[27] = "b) in einer großen, aufregenden Stadt zu arbeiten.";
		selectC[27] = "c) an einem Ort mit schönen schneebedeckten Bergen zu arbeiten.";
		nextA[27] = 55;
		nextB[27] = 56;
		nextC[27] = 57;
		AudioFilePath[27] = "Audio/Card_27/De_de/";

		// Card 28
		text[28] = "Du hast dich nach einem anderen Job in der Nähe deines Wohnortes umgeschaut, obwohl es dort kaum Arbeit gab. Du konntest keine Arbeit finden und bist schließlich pleite. Du bist gezwungen, in deine Heimatstadt zurückzukehren, um neu anzufangen.";
		nextA[28] = 0;
		isBlank[28] = true;
		AudioFilePath[28] = "Audio/Card_28/De_de/";

		// Card 29
		text[29] = "Du hast beschlossen, dein Haus zu verkaufen, obwohl du gerade erst dort eingezogen bist. Du hast einen guten Preis mit dem Verkauf erzielt und ein kleines Haus in deiner Heimatstadt gekauft. Du hast dich entschieden, deine eigene Firma zu gründen.";
		nextA[29] = 4;
		isBlank[29] = true;
		AudioFilePath[29] = "Audio/Card_29/De_de/";

		// Card 30
		text[30] = "Du hast beschlossen, dein Haus an jemand anderen zu vermieten und näher an die Stadt zu ziehen, wo du leichter Arbeit finden kannst. Der Wert der Häuser in der Gegend, in der dein Haus steht, ist angestiegen und du hast es geschafft, eine sehr preiswerte Wohnung zu mieten, in der du leben kannst. Du hast viel Geld verdient und noch mehr Grundstücke gekauft.";
		nextA[30] = 66;
		isBlank[30] = true;
		AudioFilePath[30] = "Audio/Card_30/De_de/";

		// Card 31
		text[31] = "Du hast dich entschieden, dennoch zu heiraten. Aber nach kurzer Zeit hat dir die Familie deines neuen Partners/deiner neuen Partnerin das Leben zur Hölle gemacht. Die Sache wurde noch schlimmer, als dein Partner/deine Partnerin wollte, dass seine/ihre Familie mit euch beiden zusammenzieht. Die Familie ist eingezogen - und du bist ausgezogen. Deine Ehe endete und du warst sehr traurig. Du hast dich entschieden, in eine neue Stadt zu ziehen und neu anzufangen.";
		nextA[31] = 13;
		isBlank[31] = true;
		AudioFilePath[31] = "Audio/Card_31/De_de/";

		// Card 32
		text[32] = "Du hast dich entschieden, durchzubrennen. Was für eine tolle Idee das war! Du hast geheiratet und hast in einer weit entfernten Stadt ein sehr glückliches Leben geführt. Du hast dich entschieden, Geld zu leihen, um in ein kleines Geschäft zu investieren.";
		nextA[32] = 15;
		isBlank[32] = true;
		AudioFilePath[32] = "Audio/Card_32/De_de/";

		// Card 33
		text[33] = "Du hast beschlossen, deinen Partner/deine Partnerin zu überzeugen, zu heiraten, aber aus der Heimatstadt wegzuziehen. Dein Partner/deine Partnerin hat zugestimmt. Ihr habt euch entschieden,";
		selectA[33] = "a) an einen Ort mit tropischem Klima in der Nähe des Ozeans zu ziehen.";
		selectB[33] = "b) an einen Ort mit einigen wunderschönen schneebedeckten Bergen zu ziehen.";
		nextA[33] = 55;
		nextB[33] = 57;
		isSonder[33] = true;
		AudioFilePath[33] = "Audio/Card_33/De_de/";

		// Card 34
		text[34] = "Du hast dich entschieden, deinen Chef um Geld zu bitten. Der Chef war nicht sehr glücklich darüber, aber er stimmte widerwillig unter der Bedingung zu, dass du Überstunden machst. Das hast du gemacht und der Chef vertraute dir bald und beförderte dich. Allerdings hast du schnell herausgefunden, dass die Beförderung zusätzliche Arbeit bedeutet und du jeden Abend erschöpft nach Hause kommst. Also hast du beschlossen, in deine Heimatstadt zurückzukehren und das zusätzlich verdiente Überstundengeld in ein eigenes kleines Geschäft zu investieren.";
		nextA[34] = 4;
		isBlank[34] = true;
		AudioFilePath[34] = "Audio/Card_34/De_de/";

		// Card 35
		text[35] = "Du hast dich entschieden, deinen Kollegen zu bitten, dir etwas Geld zu geben, aber er hat sich geweigert. Weil du einen Monat warten musstest, bis du bezahlt wurdest, wusstest du nicht, was du tun sollst. Du warst gezwungen, eines nachts etwas Essen aus einem Laden zu stehlen, um zu überleben. Leider wurdest du geschnappt und für ein paar Tage ins Gefängnis geschickt. Nach deiner Freilassung bist du in deine Heimatstadt zurückgekehrt, um neu anzufangen.";
		nextA[35] = 0;
		isBlank[35] = true;
		AudioFilePath[35] = "Audio/Card_35/De_de/";

		// Card 36
		text[36] = "Du hast dich dafür entschieden, einen kleinen Geldbetrag zu nehmen, konntest ihn später aber wieder zurückzahlen. Allerdings wurdest du immer unehrlicher, weil es leicht war, deine Firma zu bestehlen. Schließlich wurdest du beim Stehlen erwischt und gefeuert.";
		nextA[36] = 28;
		isBlank[36] = true;
		AudioFilePath[36] = "Audio/Card_36/De_de/";

		// Card 37
		text[37] = "Du hast dich entschieden, dem Kellner nicht zu helfen. In dieser Nacht bemerkte der Chef, dass etwas Geld fehlte und durchsuchte alle Taschen. Das Geld wurde in deiner Tasche gefunden und du hast deinen Job verloren. Du wusstest, dass der andere Kellner das Geld in deine Tasche gesteckt hatte, aber niemand glaubte dir. Du warst gezwungen, in deine Heimatstadt zurückzukehren.";
		nextA[37] = 0;
		isBlank[37] = true;
		AudioFilePath[37] = "Audio/Card_37/De_de/";

		// Card 38
		text[38] = "Du hast dich entschieden, deinem Kollegen nicht zu helfen und hast alles deinem Chef erzählt. Dein Chef war sehr froh darüber und dein Kollege wurde gefeuert, während du befördert wurdest! Du hast in diesem Jahr sehr viel Geld verdient und dich entschieden, ein neues, teures Auto zu kaufen.";
		nextA[38] = 17;
		isBlank[38] = true;
		AudioFilePath[38] = "Audio/Card_38/De_de/";

		// Card 39
		text[39] = "Du hast dich entschieden, deinem Kollegen zu helfen und dann den Job zu kündigen. Du hast das Geld behalten, es investiert und so wurde es mit der Zeit immer mehr.";
		nextA[39] = 66;
		isBlank[39] = true;
		AudioFilePath[39] = "Audio/Card_39/De_de/";
		
		// Card 40
		text[40] = "Du wolltest dich mit ihm/ihr verabreden, aber leider war er/sie verheiratet. Er/sie hielt das für einen tollen Witz und erzählte es jedem im Büro. Danach hast du dich in deinem neuen Job ziemlich unwohl gefühlt und dich entschieden, etwas Geld zu leihen und in eine Firma zu investieren.";
		nextA[40] = 15;
		isBlank[40] = true;
		AudioFilePath[40] = "Audio/Card_40/De_de/";

		// Card 41
		text[41] = "Du hast dich entschieden, zu warten, bis er/sie dich nach einem Date fragt. Das tat er/sie und du hast zugesagt. Dann später, nachdem du einen Monat lang mit dieser Person ausgegangen warst, hast du herausgefunden, dass sie verheiratet ist! Du warst untröstlich und wütend und hast dich entschieden, wieder in deine Heimatstadt zurückzukehren.";
		nextA[41] = 0;
		isBlank[41] = true;
		AudioFilePath[41] = "Audio/Card_41/De_de/";

		// Card 42
		text[42] = "Du hast dich entschieden, nichts zu tun, was gut war, weil du später herausgefunden hast, dass die Person verheiratet ist. Ein paar Monate später hast du jemand anderen kennengelernt. Ihr beide mochtet euch sehr und dieses Mal hast du ihn/sie nach einem Date gefragt. Als du ihn/sie eingeladen hast, hast du angeboten zu zahlen, aber als ihr mit dem Essen fertig wart, hast du bemerkt, dass du deine Brieftasche vergessen hast. Das war dir sehr peinlich, aber du hast beschlossen, dem Restaurant zu sagen, dass du dein Geld vergessen hast.";
		nextA[42] = 69;
		isBlank[42] = true;
		AudioFilePath[42] = "Audio/Card_42/De_de/";

		// Card 43
		text[43] = "Du hast dich entschieden, den Kurs zu verlassen. Du warst sehr deprimiert und hast angefangen, zu spielen. Du hast all deine Ersparnisse ins Casino mitgenommen, bist zum Blackjack-Tisch gegangen und hast dein ganzes Geld auf 'Schwarz' gesetzt.";
		nextA[43] = 53;
		isBlank[43] = true;
		AudioFilePath[43] = "Audio/Card_43/De_de/";

		// Card 44
		text[44] = "Du hast dich entschieden, im Kurs zu bleiben und nichts zu tun. Drei Wochen später hast du jemand anderen kennengelernt! Du hast ihn/sie gefragt, ob er/sie mit dir ausgehen will und er/sie hat ja gesagt.";
		nextA[44] = 22;
		isBlank[44] = true;
		AudioFilePath[44] = "Audio/Card_44/De_de/";

		// Card 45
		text[45] = "Du hast dich entschieden, einen Weg zu finden, dich an deinem Ex-Freund/deiner Ex-Freundin zu rächen. Du";
		selectA[45] = "a) beschädigst seinen/ihren Wagen durch Abkratzen des Lacks von der Seite der Tür.";
		selectB[45] = "b) verbreitest Gerüchte über ihn/sie.";
		selectC[45] = "c) überlegst es dir in letzter Minute anders und tust nichts.";
		nextA[45] = 70;
		nextB[45] = 71;
		nextC[45] = 72;
		AudioFilePath[45] = "Audio/Card_45/De_de/";

		// Card 46
		text[46] = "Du hast dich entschieden, Insolvenz anzumelden.";
		nextA[46] = 0;
		isBlank[46] = true;
		AudioFilePath[46] = "Audio/Card_46/De_de/";

		// Card 47
		text[47] = "Du hast dich entschieden, in zwei Jobs zu arbeiten und das Geld zurückzuzahlen. Du warst erfolgreich und bald hattest du viel Geld auf der Bank. Bei deinem zweiten Job hast du eine Person getroffen, die dir wirklich gefiel, und du hast beschlossen, sie um ein Date zu bitten. Sie hat zugestimmt.";
		nextA[47] = 24;
		isBlank[47] = true;
		AudioFilePath[47] = "Audio/Card_47/De_de/";

		// Card 48
		text[48] = "Du hast dich entschieden, dein Haus niederzubrennen und das Versicherungsgeld zu kassieren, um deine Schulden zurückzuzahlen. Unglücklicherweise wurdest du erwischt.";
		nextA[48] = 70;
		isBlank[48] = true;
		AudioFilePath[48] = "Audio/Card_48/De_de/";

		// Card 49
		text[49] = "Du hast dich entschieden, allein um Hilfe zu schwimmen. Du hast es an Land geschafft und hast Hilfe für deinen Freund zurückgeschickt. Du hast etwas Versicherungsgeld für dein Boot bekommen und du entscheidest dich nach dieser stressigen Situation für einen Urlaub.";
		nextA[49] = 57;
		isBlank[49] = true;
		AudioFilePath[49] = "Audio/Card_49/De_de/";

		// Card 50
		text[50] = "Du hast dich entschieden, mit deinem Freund zusammen zu schwimmen, um Hilfe zu holen. Ihr hattet großes Glück, als ein Fischerboot euch beide im Wasser gesehen und euch herausgezogen hat. Dankbar seid ihr an Land zurückgekehrt, aber du hattest das meiste deines Geldes verloren, da du keine Versicherung hattest. Du hast dich entschieden, zu spielen, um das Geld zurückzugewinnen. Du bist ins Casino gegangen und hast dein ganzes Geld auf Rot bei Blackjack gesetzt.";
		nextA[50] = 52;
		isBlank[50] = true;
		AudioFilePath[50] = "Audio/Card_50/De_de/";

		// Card 51
		text[51] = "Du hast dich entschieden, auf Hilfe zu warten. Leider kam niemand und du und dein Freund seid ertrunken.";
		isOver[51] = true;
		AudioFilePath[51] = "Audio/Card_51/De_de/";

		// Card 52
		text[52] = "Du hast dich für Rot entschieden. Du hast dein ganzes Geld verloren! Du bist gezwungen, zu deinem alten Job in deiner Heimatstadt zurückzukehren.";
		nextA[52] = 0;
		isBlank[52] = true;
		AudioFilePath[52] = "Audio/Card_52/De_de/";

		// Card 53
		text[53] = "Du hast dich für Schwarz entschieden - und damit hast du dein Geld verdoppelt! Du beschließt, noch einmal zu spielen, und hast dein Geld erneut verdoppelt. Das ging so lange weiter, bis du eine große Menge an Geld hattest. Dann hast du dich entschieden, ein Boot zu kaufen.";
		nextA[53] = 16;
		isBlank[53] = true;
		AudioFilePath[53] = "Audio/Card_53/De_de/";

		// Card 54
		text[54] = "Du hast alles auf Nummer 7 gesetzt und damit alles verloren. Aber du hast deine Lektion gelernt und nie wieder gespielt. Stattdessen hast du dich entschieden, in einem Casino im Schnee als Croupier zu arbeiten.";
		nextA[54] = 57;
		isBlank[54] = true;
		AudioFilePath[54] = "Audio/Card_54/De_de/";

		// Card 55
		text[55] = "Du hast die tropische Insel gewählt. Der erste Monat war wunderbar, aber dann wurdest du von einer Mücke gestochen und wurdest dadurch schwer krank. Du musstest für sechs Monate ins Krankenhaus und hast deinen Job verloren. Du hast dich entschieden, in deine Heimatstadt zurückzukehren, um dich ein weiteres Jahr auszuruhen, da du immer noch sehr krank warst.";
		nextA[55] = 0;
		isBlank[55] = true;
		AudioFilePath[55] = "Audio/Card_55/De_de/";

		// Card 56
		text[56] = "Du hast dich für eine aufregende Großstadt entschieden. Das war eine großartige Wahl, da du den Lebensstil und den Spaß wirklich genossen hast. Eines Abends bist du in einen Nachtclub gegangen. Du hast eine tolle Person getroffen, dich verliebt und entschieden, nicht mehr nach Hause zurückzukehren.";
		nextA[56] = 73;
		isBlank[56] = true;
		AudioFilePath[56] = "Audio/Card_56/De_de/";

		// Card 57
		text[57] = "Du hast dich für die Berge entschieden. Du hattest eine wunderbare Zeit dort, aber eines Tages bist du beim Skifahren gestürzt und hast dir das Bein gebrochen. Du hattest keine Versicherung abgeschlossen, also hast du dein ganzes Geld für die Arztkosten ausgegeben! Du bist gezwungen, in deine Heimatstadt zurückzukehren.";
		nextA[57] = 0;
		isBlank[57] = true;
		AudioFilePath[57] = "Audio/Card_57/De_de/";

		// Card 58
		text[58] = "Du hast dich entschieden, den Schmuck zu verkaufen. Dadurch hast du einen großen Gewinn erzielt und beschlossen, in das Geschäft einzusteigen und Schmuck zu verkaufen. Du warst extrem talentiert darin und hast sehr gut gearbeitet. Du hast dich entschieden, in ein Boot zu investieren.";
		nextA[58] = 16;
		isBlank[58] = true;
		AudioFilePath[58] = "Audio/Card_58/De_de/";

		// Card 59
		text[59] = "Du hast dich entschieden, Schmuck und Geld in einem Safe zu verwahren. Zu deinem Leidwesen sind kurze Zeit später Diebe in dein Haus eingebrochen und haben den Safe gestohlen. Du hattest wieder einmal nicht mehr viel Geld übrig. Also hast du dich entschieden, dich noch einmal weiterzubilden, um deine Chancen zu erhöhen.";
		nextA[59] = 14;
		isBlank[59] = true;
		AudioFilePath[59] = "Audio/Card_59/De_de/";

		// Card 60
		text[60] = "Du hast dich entschieden, den Schmuck zu tragen oder ihn jemand anderem zum Tragen zu geben. Leider war der Schmuck, den du gekauft hattest, gestohlen. Du wurdest wegen Hehlerei angeklagt.";
		nextA[60] = 70;
		isBlank[60] = true;
		AudioFilePath[60] = "Audio/Card_60/De_de/";

		// Card 61
		text[61] = "Du hast dich entschieden, die Brieftasche mitsamt dem Geld an die Besitzerin zurückzugeben. Die Besitzerin, eine alte Dame, gibt dir dafür eine kleine Belohnung, da das Geld in ihrer Brieftasche ihre gesamten Ersparnisse waren. Die Belohnung war sehr klein, aber es war alles, was sie sich leisten konnte.";
		nextA[61] = 72;
		isBlank[61] = true;
		AudioFilePath[61] = "Audio/Card_61/De_de/";

		// Card 62
		text[62] = "Du hast dich entschieden, das Geld zu behalten, aber du hast die Brieftasche dem Taxifahrer zurückgegeben. Leider hat der Taxifahrer im Rückspiegel gesehen, wie du das Geld aus der Brieftasche genommen hast.";
		nextA[62] = 70;
		isBlank[62] = true;
		AudioFilePath[62] = "Audio/Card_62/De_de/";

		// Card 63
		text[63] = "Du hast dich entschieden, das Geld zu behalten und die Brieftasche wegzuwerfen. Du hast beschlossen, das Geld in einen Safe zu legen.";
		nextA[63] = 59;
		isBlank[63] = true;
		AudioFilePath[63] = "Audio/Card_63/De_de/";

		// Card 64
		text[64] = "Du hast dich entscheiden, dafür zu sorgen, dass dein Kollege gefeuert wird, indem du alles deinem Chef erzählst. Der Chef hat dich für deine Aktion mit einem Urlaub belohnt. Du hast dich für";
		selectA[64] = "a) eine tropische Insel entschieden.";
		selectB[64] = "b) eine große aufregende Stadt entschieden.";
		selectC[64] = "c) wunderschöne schneebedeckte Berge entschieden.";
		nextA[64] = 55;
		nextB[64] = 56;
		nextC[64] = 57;
		AudioFilePath[64] = "Audio/Card_64/De_de/";

		// Card 65
		text[65] = "Du hast dich entschieden, den Job zu kündigen. Es war wirklich die richtige Wahl, auch wenn dein nächster Job nicht so gut bezahlt ist. Dein neuer Job ist viel interessanter und die Leute, mit denen du arbeitest, sind großartig.";
		nextA[65] = 72;
		isBlank[65] = true;
		AudioFilePath[65] = "Audio/Card_65/De_de/";

		// Card 66
		text[66] = "Du hast immer mehr Geld verdient. Bald wurdest du besessen davon, reich zu werden. Dieses Ziel hast du schließlich erreicht. Leider hast du festgestellt, dass Geld dich nicht glücklich macht und obwohl du alles hattest, was du brauchst, hast du ein einsames Leben geführt.";
		isOver[66] = true;
		AudioFilePath[66] = "Audio/Card_66/De_de/";

		// Card 67
		text[67] = "Du hast dich entschieden, das Restaurant zu verlassen, ohne zu bezahlen. Du hast deinem Partner/deiner Partnerin gesagt, dass er/sie draußen auf dich warten soll und du in einer Minute da bist. Der Restaurantleiter hat dich jedoch erwischt, als du versucht hast, das Restaurant zu verlassen und hat die Polizei gerufen. Du wurdest verhaftet und musstest eine Nacht im Gefängnis verbringen. Am nächsten Tag hast du deine Wohnung verkauft, die Koffer gepackt und bist nach Hause in deinen ursprünglichen Job zurückgekehrt.";
		nextA[67] = 0;
		isBlank[67] = true;
		AudioFilePath[67] = "Audio/Card_67/De_de/";

		// Card 68
		text[68] = "Du hast dich entschieden, deinen Partner/deine Partnerin zu bitten, das Essen zu bezahlen. Das hat er/sie auch gemacht, aber er/sie war nicht glücklich darüber. Er/sie wollte dich nicht wiedersehen. Du warst deprimiert deswegen und wegen all deiner anderen Probleme. Also bist du wieder nach Hause in deinen ursprünglichen Job zurückgekehrt.";
		nextA[68] = 0;
		isBlank[68] = true;
		AudioFilePath[68] = "Audio/Card_68/De_de/";

		// Card 69
		text[69] = "Du hast dich entschieden, dem Restaurant zu sagen, dass du kein Geld hast. Du bist dort geblieben und hast gearbeitet. Der Restaurantbesitzer/Die Restaurantbesitzerin war so beeindruckt von dir, dass du dort einen Vollzeitjob bekommen hast. Schließlich bist du Koch/Köchin geworden und hast viele Auszeichnungen dafür erhalten. Am Ende hast du den Restaurantbesitzer/die Restaurantbesitzerin geheiratet und ihr habt glücklich bis ans Ende eurer Tage gelebt!";
		isOver[69] = true;
		AudioFilePath[69] = "Audio/Card_69/De_de/";

		// Card 70
		text[70] = "Du wurdest für ein paar Monate ins Gefängnis geschickt. Als du aus der Haft entlassen wurdest, hattest du alles verloren. Deswegen hast du dich entschieden, nach Hause zurückzukehren.";
		nextA[70] = 0;
		isBlank[70] = true;
		AudioFilePath[70] = "Audio/Card_70/De_de/";

		// Card 71
		text[71] = "Du beschließt, Gerüchte über deinen Ex-Partner/deine Ex-Partnerin zu verbreiten. Alle glaubten die Gerüchte und man bat deinen Ex-Partner/deine Ex-Partnerin irgendwann, die Firma zu verlassen. Ein paar Monate später hast du jemand Neues getroffen und ihn/sie in ein Restaurant zu einem romantischen Abendessen eingeladen. Du hast angeboten, für das Essen zu zahlen.";
		nextA[71] = 22;
		isBlank[71] = true;
		AudioFilePath[71] = "Audio/Card_71/De_de/";

		// Card 72
		text[72] = "Du hast dich durch dein Verhalten gut gefühlt. Du hast dich zu einer reifen, verantwortungsvollen Person entwickelt. Dein Leben hat sich verbessert und du hast viele Freunde gefunden. Schließlich hast du dich in einen wunderbaren Menschen verliebt, den du geheiratet und mit dem du eine Familie gegründet hast. Ihr lebt glücklich bis ans Ende eurer Tage zusammen!";
		isOver[72] = true;
		AudioFilePath[72] = "Audio/Card_72/De_de/";

		// Card 73
		text[73] = "Du bist mit dieser neuen Liebe deines Lebens zusammengeblieben. Nicht lange danach hat deine neue Liebe ein Vermögen geerbt. Ihr verbringt den Rest eures Lebens damit, um die Welt zu reisen und habt eine Menge Spaß miteinander!";
		isOver[73] = true;
		AudioFilePath[73] = "Audio/Card_73/De_de/";
		if(animation) {
//		ProgressBarGUI ProgressBarGUI = new ProgressBarGUI(Words.get(WordTypes.LoadCardsTitel), 74);
//
//		CardGame.cards.clear();
//		for (int i = 0; i < 74; i++) {
//			if (isSonder[i] == true) {
//				CardGame.cards.add(new Card(text[i], selectA[i], selectB[i], nextA[i], nextB[i], true,AudioFilePath[i]));
//			} else if (isOver[i] == false && isBlank[i] == false) {
//				CardGame.cards
//						.add(new Card(text[i], selectA[i], selectB[i], selectC[i], nextA[i], nextB[i], nextC[i],AudioFilePath[i]));
//			} else if (isOver[i] == true) {
//				CardGame.cards.add(new Card(text[i],AudioFilePath[i]));
//			} else if (isBlank[i] == true) {
//				CardGame.cards.add(new Card(text[i], nextA[i],AudioFilePath[i]));
//			}
//			ProgressBarGUI.fill(i);
//			int random = new Random().nextInt(100);
//			ProgressBarGUI.Warten(random);
//		}
//		ProgressBarGUI.fill(74);
//		ProgressBarGUI.progressend(Words.get(WordTypes.LoadCardsEnd));
		}else {
			CardGame.cards.clear();
			for (int i = 0; i < 74; i++) {
				if (isSonder[i] == true) {
					CardGame.cards.add(new Card(text[i], selectA[i], selectB[i], nextA[i], nextB[i], true,AudioFilePath[i]));
				} else if (isOver[i] == false && isBlank[i] == false) {
					CardGame.cards
							.add(new Card(text[i], selectA[i], selectB[i], selectC[i], nextA[i], nextB[i], nextC[i],AudioFilePath[i]));
				} else if (isOver[i] == true) {
					CardGame.cards.add(new Card(text[i],AudioFilePath[i]));
				} else if (isBlank[i] == true) {
					CardGame.cards.add(new Card(text[i], nextA[i],AudioFilePath[i]));
				}
			}
		}
	}
}