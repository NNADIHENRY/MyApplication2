package com.example.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Articles extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {


            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("INTRODUCTION");
        listDataHeader.add("Who Does Postnatal Care And To Whom");
        listDataHeader.add("Components Of Postnatal Care");
        listDataHeader.add("Postnatal care for Mothers – Taking Care Of yourself After Birth.");
        listDataHeader.add("Postnatal Care Checks For Babies");
        listDataHeader.add("Importance Of Postnatal Care");
        listDataHeader.add("Postnatal Exercise");
        listDataHeader.add("BLOOD SPOT SCREENING");
        listDataHeader.add("POSTNATAL CARE IN ETHIOPIA");
        listDataHeader.add("POSTNATAL CARE IN INDIA");
        listDataHeader.add("POSTNATAL CARE IN NEPAL");
        listDataHeader.add("POSTNATAL CARE IN SOUTH AFRICA");
        listDataHeader.add("POSTNATAL CARE IN KENYA");
        listDataHeader.add("POSTNATAL CARE IN NORWAY");
        listDataHeader.add("POSTNATAL CARE IN NIGERIA");
        listDataHeader.add("THE COUNTRY WITH THE BEST POSTNATAL CARE:");
        listDataHeader.add("INADEQUACIES IN POSTNATAL CARE");
        listDataHeader.add("POST-NATAL CARE: DO’S AND DONT’S AFTER NORMAL DELIVERY");
        listDataHeader.add("UNEXPECTED SUDDEN INFANT DEATH IN POSTNATAL PERIOD");

        // Adding child data
        List<String> introduction = new ArrayList<String>();
        introduction.add("Postnatal is occurring or being after birth; specifically of or relating to an infant immediately after birth. But before I talk  about postnatal care, I will like to open our mind to “PRENATAL AND PRENATAL CARE”. Prenatal refers to being or happening before birth while Prenatal care, also known as antenatal care, is a  type  of preventive healthcare. Its goal is to provide regular check-ups that allow doctors or midwives to treat and prevent potential  health problems throughout the course of the pregnancy and to promote health lifestyle that benefits both mother and child.\n" +
                "Postnatal care is the care given to the mother and her newborn baby immediately after the birth and for the first six weeks of life.  It includes systematic examination of mother and baby and appropriate advice given to the mother during postpartum period .It is a continuation of the care the woman has received through her pregnancy, labour and birth and take into account the woman’s individual needs and preferences. It should aim to create a supportive environment in which families will be guided by professional on how to care for their baby and themselves and be able to recognize and act upon any deviation from the normal. (NICE 2000; updated 2015) .\n" +
                "It is also about recognizing any deviation from expected recovery after birth. This period is called postnatal period which begins one hour after the birth of the placenta and stretches to six weeks after child birth (LII, 2006). Basic care for all newborns should include, promoting and supporting  early exclusive breastfeeding, keeping the baby warm, increasing hand -washing and providing hygienic umbilical cord  and skin care identifying conditions requiring additional care and counselling on when to take newborn to a health facility. \n" +
                "Newborns and the mothers should be examined for danger signs and the need for prompt care seeking if one or more of them are present (WHO 2012).Regardless of place of birth, mothers and newborns spend most of their postnatal period (The first six weeks after birth) at home. Postnatal  care is one of the most important maternal health –care services for not only on prevention of complications of impairment but also reduction of maternal mortality. Postnatal care services enable the health professionals to identify post delivery problems, including potential complications and prompt treatment as well as promoting health of the mother and baby (WHO, 2006). Postnatal care seeks to improve maternal, newborn care and family planning services(WHO, 2006).\n" +
                "The elements of postnatal care are inter alia; prevention of complication of mother and baby including vertical transmission of diseases from mother to baby, early detection and treatment of problems and complication readiness, provision of care to mother and baby by skilled attendant, assisting the mother and her family to evaluate and develop personalized postnatal care  plan, counselling for HIV and testing, counselling for contraception (birth spacing) and resumption of sexual activity, health promotion using health messages and counselling, referral of mother and baby for special care when necessary.(WHO,2006)\n" +
                "The time when effective postnatal care can make the most difference to the health and life chances of mother and newborn is in the early neonatal period, the time just after the delivery and through the seven days of life. Similarly, reports of maternal mortality include deaths of women from complications associated with postnatal problems, not just problems arising during the birth .Both these rates are important indicators of the effectiveness of postnatal care . So postnatal period needs to be focused more and attention paid to it because that is a very critical time for the mother and her baby.");


        List<String> towhom = new ArrayList<String>();
        towhom.add("Postnatal care is performed by midwives, nurses, doctors, physicians etc. It is done to Mothers and their newborn for the first six weeks after birth.");


        List<String> components = new ArrayList<String>();
        components.add("(a) \tContiunity Of Care\n" +
                "Continuity of care is concerned with quality of care over time. It is the process by which the patient and his /her physician-led care team are cooperatively involved in ongoing health care management toward the shared goal of high quality, cost- effective medical care. Postnatal care should be a continuation of the care the woman received during her pregnancy, labour and birth. Planning and regularly reviewing the content and timing of care, for individual women and their babies, and communicating this (to the woman, her family and other relevant     postnatal care team members) through a documented care plan can improve continuity of care.\n" +
                "(b) Infant Health-Safer Infant Sleeping\n" +
                "This refers to best or safer sleeping mode for infant. This include:\n" +
                "a.\tKeep baby on back\n"+
                "b.\tkeep baby’s head and face uncovered \n" +
                "c.\tprovide a safe sleeping environment night and day.\n" +
                "d.\tSleep baby in your safe cot in your room.\n" +
                "e. \tBreastfeed baby.\n" +
                "Women, their partner or the main carer are given information on the association between co-sleeping and sudden infant death syndrome at ach postnatal contact. Although the cause of SIDS is unknown, there are specific behaviours that may make SIDS more likely. There is some evidence that where co-sleeping occurs there may be an increase in the number of cases of SIDS. Giving information to women, their partner or the main carer about this association will support them to establish safer infant sleeping habits, and may reduce the likelihood of SIDS.\n" +

                "(c)\tBreastfeeding:\n" +
                "Breastfeeding also known as nursing, is the feeding of babies and young children with milk from a woman’s breast. Mother’s may pump milk so that it can be used later when breastfeeding is not possible .Breastfeeding has a number of benefits to both mother and baby, which infant formula lacks. Breastfeeding contributes to the health of both the mother and child in the short and longer term. Women should be made aware of these benefits and those who choose to breastfeed should be supported by a service that is evidence based and delivers an externally audited, structured programme. Women receive breastfeeding support through a service that uses an evaluated, structured programme during postnatal period .\n" +

                "(d)\tParent-Baby Attachement\n" +
                "Attachment  is the deep emotional bond between a baby and the person who provides most of his care. Just as most parents feel a strong connection with their newborn after birth , babies also become attached to their parents. Attachment takes place throughout a child’s development. Problems with parent-to-baby attachment may result in the baby developing emotional, psychological or behavioural issues in childhood. Providing family-based interventions could improve attachment, thereby providing the building blocks for the child to develop healthy behaviours and mental wellbeing. Parents or main carers who have infant attachment problems receive services designed to improve their relationship with their baby.\n" +

                "(e)\tInfant Health – Physical Examination:\n" +
                "This refers to newborn’s physical examination, their health-care provider or doctor usually gives the newborn a thorough physical examination within the first 24 hours of life, then the examines the newborn’s skin, head and neck, heart and lungs, abdomen and genitals and assesses the  newborns nervous system and reflexes. The purpose of the examination is to identify babies more likely to have conditions that would benefit from further investigation and management. This includes an overall physical examination as well as screening for eye problems, congenital heart defects, developmental dysplasia of the hip and undecided testicles. Most babies will be healthy, but the small number of babies who do have serious problems will benefit from prompt identification. Early treatment can improve the health of the baby and prevent or reduce disability. The mother or main carer of the baby is given the opportunity for their baby to have a complete 6 – 8 weeks physical examination, which is carried out in timely manner and by a competent practioner.\n" +
                "(f)\tFormula Feeding:\n" +
                "This refers to the action of feeding a baby with formula, as opposed to breast milk. Commercially prepared infant formulas are a nutritious alternative to breast milk, and even contain some vitamins and nutrients that breastfed babies need to get from supplements Babies who are fully or partially formula fed can develop infections and illnesses if their formula milk is not prepared safely. The mother or main carer of the baby needs consistent, evidence‑ based advice about how to sterilise feeding equipment and safely prepare formula milk.\n" +

                "(g)\tMaternal Health – Mental Wellbeing:\n" +
                "Mental wellbeing is an integral part of our overall health. It is also the state of thriving in various areas of life, such as in relationships, at work, play and more despite ups and downs. It’s the knowledge that we are separate from our problems and the belief that we can handle those problems. Women experience emotional changes in the immediate postnatal period which usually resolve within 10–14 days after the birth. Women who are still feeling low in mood, anxious, experiencing negative thoughts or lacking interest in their baby at10–14 days after the birth may be at increased risk of mental health problems. These women should receive an assessment of their mental well being.\n" +
                "(h)\tMaternal Health – Weight Management:\n" +
                "Weight Management is the process of adopting long-term lifestyle modification to maintain a healthy body weight on the basis of a person’s age, sex and height. Methods of weight management include eating a healthy diet and increasing physical activity levels. The woman's eating habits and physical activity levels could influence the health behaviour of the wider family, including children who are developing habits that may remain with them for life.  the woman in the postnatal period to change her eating habits and physical activity levels may improve her health, her infant's health and the health of the wider family. It may also improve the outcomes of future pregnancies. Women who are obese during pregnancy face increased risks of complications that include gestational diabetes, miscarriage, pre‑eclampsia, thromboembolism and maternal death. Risks for The infant include fetal death, stillbirth, shoulder dystocia, and macrosomia. Infants of obese women face health risks in childhood including diabetes and obesity in later life.");
        List<String> yourself = new ArrayList<String>();
        yourself.add("The postpartum period begins after the delivery of the baby and ends when the mother's body has nearly returned to its pre-pregnant state. This period usually lasts six to eight weeks. The postpartum period involves the mother progressing through many changes, both emotionally and physically, while learning how to deal with all the changes and adjustments required with becoming a new mother. The postpartum period also involves the parents learning how to care for their newborn and learning how to function as a changed family unit. A mother needs to take good care of herself to rebuild her strength. You will need plenty of rest, good nutrition, and help during the first few weeks.\n" +
                "a.\tRest:\t\n" +
                "Every new parent soon learns that babies have different time clocks than adults. A typical newborn awakens about every three hours and needs to be fed, changed, and comforted. Especially if this is their first baby, parents–in particular the mother–can become overwhelmed by exhaustion. Although a solid eight hours of sleep for you may not happen again for several months, the following suggestions may be helpful in finding ways to get more rest now. In the first few weeks, a mother needs to be relieved of all responsibilities other than feeding the baby and taking care of herself. Sleep when the baby sleeps. \n" +
                "\n" +
                "This maybe only a few minutes of rest several times a day, but these minutes can add up .Save steps and time. Have your baby's bed near yours for feedings at night. Many new parents enjoy visits from friends and family, but new mothers should not feel obligated to entertain. Feel free to excuse yourself for a nap or to feed your baby. Get outside for a few minutes each day. You can begin walking and doing postpartum exercises, as advised by your health care provider. After the first two to three weeks, introduce a bottle to breastfed babies for an occasional night time feeding. This way, someone else can feed the baby, and you can have a longer period of uninterrupted sleep.\n" +
                "b.\tNutrition:\n" +
                "A mother's body has undergone many changes during pregnancy, as well as with the birth of her baby. She needs to heal and recover from pregnancy and childbirth. In addition to rest, all mothers need to maintain a healthy diet to promote healing and recovery. The weight gained in pregnancy helps build stores for your recovery and for breastfeeding. After delivery, all mothers need to eat well so that they can be healthy and active and able to care for their baby. Whether they breastfeed or formula feed, all mothers need to eat a healthy and balanced diet. \n" +
                "Most lactation experts recommend that breastfeeding mothers should eat when they are hungry. But many mothers may be so tired or busy that food gets forgotten. So, it is essential to plan simple and healthy meals that include choices from all of the recommended groups from Choose My Plate. The Choose My Plate icon is a guideline to help you eat a healthy diet. My Plate can help you eat a variety of foods while encouraging the right amount of calories and fat. The USDA and the U.S. Department of Health and Human Services have prepared the following food plate to guide you in selecting foods. The My Plate icon is divided into five food group categories, emphasizing the nutritional intake of the following:\n" +
                "c.\tGrains: Foods that are made from wheat, rice, oats, cornmeal, barley, or another cereal grain are grain products. Examples include whole wheat, brown rice, and oatmeal.\n" +
                "d.\tVegetables: Vary your vegetables. Choose a variety of vegetables, including dark green, red, and orange vegetables, legumes (peas and beans),and starchy vegetables.\n" +
                "e.\tFruits:\t Any fruit or 100 percent fruit juice counts as part of the fruit group. Fruits may be fresh, canned, frozen, or dried, and may be whole, cut-up, or pureed.\n" +
                "f.\tDairy:\tMilk products and many foods made from milk are considered part of this food group. Focus on fat-free or low-fat products, as well as those that are high in calcium.\n" +
                "g.\tProtein: Go lean on protein. Choose low-fat or lean meats and poultry. Vary your protein routine--choose more fish, nuts, seeds, peas, and beans.\n" +
                "h.\tOils: are not a food group, yet some, such as nut oils, contain essential nutrients and can be included in the diet. Others, such as animal fats, are solid and should be avoided.\n" +
                "Exercise and everyday physical activity should also be included with a healthy dietary plan. Although most mothers want to lose their pregnancy weight, extreme dieting and rapid weight loss can be hazardous to your health and to your baby's if you are breastfeeding. It can take several months for a mother to lose the weight she gained during pregnancy. This can be accomplished by cutting out high-fat snacks and concentrating on a diet with plenty of fresh vegetables and fruits, balanced with proteins and carbohydrates. Exercise also helps burn calories and tone muscles and limbs.\n" +
                "Along with balanced meals, breastfeeding mothers should increase fluids. Many mothers find they become very thirsty while the baby is nursing. Water, milk, and fruit juices are excellent choices. It is helpful to keep a pitcher of water and even some healthy snacks beside your bed or breastfeeding chair. Consult your health care provider or a registered dietician if you want to learn more about postpartum nutrition. Certified lactation consultants can also help with advice about nutrition while breast feeding. Help for new parents New as well as experienced parents soon realize that babies require a lot of work. Meeting the constant needs of a newborn involves time and energy and often takes parents away from other responsibilities in the home. Although many parents do fine on their own, having someone else helping with the household responsibilities usually makes the adjustment to a new baby easier. Parents can concentrate on the needs of mother and baby, rather than the laundry or dirty dishes. Helpers can be family, friends, or a paid home care provider. \n" +
                "A family member such as the new baby's grandmother or aunt maybe able to come for a few days or longer. Home care providers offer a variety of services, from nursing care of the new mother and baby to housekeeping and care of other children. Whoever you decide to have as helpers, be sure to make clear all the things you expect them to do. Communication is important in preventing hurt feelings or misunderstandings when emotions are fragile these first few weeks. It is generally best for the new mother to be relieved of all responsibilities except the feeding and care of herself and her baby. This is especially important if she is breastfeeding. Others should assume the chores in the home such as cooking, cleaning, laundry, and grocery shopping. This will help the new mother take care of herself, and keep her from limiting her time with her baby.");
        List<String> Checks_For_Babies = new ArrayList<String>();
        Checks_For_Babies.add("After birth, your baby will have health checks to detect conditions and abnormalities. Here we look at the different checks and tests they'll have...Your baby’s very first postnatal check will be the Apgar score, which your midwife will complete a tone minute and then five minutes after he is born. The test is so quick you may not even notice it being done – having just given birth. Your midwife will check your baby for a number of factors including:\n" +
                "a. \tSkin colour\t\n" +
                "b.\theart rate\n" +
                "c.\treflex response\n" +
                "d.\tmuscle tone\n" +
                "e.\tbreathing.\n" +
                "Most babies will show no signs of concern however, if the midwife notices any issues she\n" +
                "can call for immediate treatment. As such these checks are an important aspect of your postnatal care. \n" +
                "1.\tBlood Spot Screening\n" +
                "Throughout the UK, all newborn babies a rescreened using something called the blood spottest (it used to be known as the Guthrie test or Heel Prick test).\n" +
                "\"It’s offered to all newborn babies between five and ten days old, and it can screen for up to five conditions (depending on your health authority).\n" +
                "\"It most commonly tests for the following\n" +
                "conditions:\n" +
                "Phenylketonuria: a condition that interferes with an individual’s ability to regulate amino acid. A build-up of amino acids can lead to severe mental handicap.\n" +
                "Congenital hypothryroidism: this is characterised by a lack of the growth hormone thyroxine. Without this hormone normal growth cannot occur.\n" +
                "Cystic fibrosis: this is an inherited condition that affects the lungs and digestive system. Cystic fibrosis is one of the UK's most common life-threatening inherited diseases. Around 9,300people in the UK have this condition which is caused by a faulty gene that controls the movement of salt and water in and out of the cells within the body. It affects the internal organs, especially the lungs and digestive system, by clogging them with thick sticky mucus. This makes it hard to breathe and digest food.\n" +
                "Each week, five babies are born with cystic fibrosis and currently there is no cure. If two carriers of the faulty cystic fibrosis gene have a child, the baby has a 1 in 4 chance of having cystic fibrosis. Over two million people in the UK carry the faulty gene that causes it - around 1 in 25 of the population. Currently half of the cystic fibrosis population will live past 41 years of age, and improvements in treatments mean a baby born today is expected to live even longer. \n" +
                "Less commonly tested conditions are: \n" +
                "a.\tSickle cell disease: an inherited disorder that affects the red blood cells, reducing their ability to carry oxygen around the body.\n" +
                "b.\tMCADD: a rare inherited disorder where the body cannot break down fat effectively.\n" +
                "\"Few babies are diagnosed with the above conditions, however for the few that are, the benefits of screening and early detection are significant.\n" +
                "2.\tPhysical Examinations\n" +
                "After the birth of your baby, you should be offered two full physical neonatal examinations of\n" +
                "your newborn. The first should take place in the first 72 hours after birth and the second should\n" +
                "be carried out around six weeks after birth to eight weeks old, around the same time you have\n" +
                "your postnatal check-up (see article ). Your baby will be given an overall top-to-toe\n" +
                "physical examination but with a special focus on his eyes, heart, hips and for boys, their testes.\n" +
                "This examination will help identify specific health\n" +
                "conditions including:\n" +
                "a.\tEye abnormalities such as congenital cataracts and retinoblastoma (a rare\n" +
                "childhood cancer).\n" +
                "b.\tCongenital heart disease.\n" +
                "c.\tCongenital dislocated hip (CHD) and\n" +
                "developmental dysplasia of the hip (DDH).\n" +
                "d.\tDelayed descent of boys’ testes.\n" +
                "The examinations will provide you with an opportunity to talk with a healthcare professional about looking after your baby and any concerns you may have about his feeding and health. This will also be a good time to discuss any future immunisations your baby will need.\n" +
                "3.\tHearing Screening\n" +
                "This test is usually carried out by trained hearing screeners as part of your maternity care in hospital (ask your midwife and/or GP if you have a home birth). It will usually involve a trained screener placing a small soft-tipped earpiece in the outer part of your baby’s ear, which sends clicking sounds down the ear. This type of test is called an automated otoacustic emission (AOAE) screening test. It only takes a few minutes and the results are immediate. If the test does not show a clear result from either one or both of your baby’s ears then your baby will need a second test, however, this is fairly common and doesn’t necessarily mean that he has hearing problems.");

        List<String> importance = new ArrayList<String>();
        importance.add("The main purpose of providing optimal postnatal care is to avert both maternal and neonatal death, as well as long-term complications. ... Knowing what mothers and newborns are dying from is important in order to identify the high impact interventions that address all the major causes of death during the postnatal period.");

        List<String> exercise = new ArrayList<String>();
        exercise.add("Postnatal exercise can be defined as an exercise done at the first six weeks after birth by mothers. When you first start exercising after childbirth, try simple postpartum exercise that help strengthen major muscles. Gradually and moderate exercise. Remember even 10 minutes of exercise benefits your body\n" +
                "1.61\tThe Benefits Of Postnatal Exercise\n" +
                "Exercising after you have your baby can improve your physical and mental wellbeing. It can:\n" +
                "    (i) Help restore muscle strength and firm up your body\n" +
                "    (ii) Make you less tired because it raises your energy level and improves your sense of wellbeing\n" +
                "    (iii) Promote weight loss\n" +
                "    (iv) Improve your cardiovascular fitness and restore muscle strength\n" +
                "    (v) Condition your abdominal muscles\n" +
                "    (vi) Improve your mood, relieve stress and help prevent postpartum depression.\n" +
                "\n" +
                "Fig 7. Typical Pictures Of Postnatal care Exercise\n" +
                "1.62\tWhen To Start Postnatal Exercises\n" +
                "Gentle exercise (such as walking) can generally be started as soon as comfortable after giving        birth. Start when you feel up to it. Some women will feel able to start exercising early. Talk with your doctor about when is a good time for you to restart an exercise program.\n" +
                "Six weeks after giving birth, most of the changes that occur during pregnancy will have returned to normal. If you had a caesarean birth, a difficult birth, or complications, it may take a little longer to feel ready to start exercising. If you did not exercise during pregnancy, start with easy exercises and slowly buildup to harder ones. Keep in mind your lower back and core abdominal muscles are weaker than they used to be. Your ligaments and joints are also more supple and pliable, so it is easier to injure yourself by stretching or twisting too much. Avoid any high-impact exercises or sports\tthat\trequire\t\trapid\tdirection\tchanges.  \n" +
                "\n" +
                "\n" +
                "1.63\tBreastfeeding And Exercise\n" +
                "Studies have shown that vigorous or regular exercise does not have adverse effects on a mother’s ability to successfully breastfeed as long as fluid and caloric intake are maintained. Some research, however, suggests that high-intensity physical activity can cause lactic acid to accumulate in breast milk and produce a sour taste a baby might not like. If you're breastfeeding, you can prevent this potential problem by sticking to low- to moderate-intensity physical activity and drinking plenty of fluids during and after your workout.\n" +
                "1.64\tCreating Time For Postnatal Exercise\n" +
                "When you're caring for a newborn, finding time for physical activity can be challenging. Some days you may simply feel too tired for a full workout. But that doesn't mean that you should put physical activity on the back burner. Do the best you can. Suggestions include:\n" +
                "    (1) Seek the support of your partner, family and friends. Exercise with a friend to stay motivated.\n" +
                "    (2) Walking is a good way to get back in shape – all you need is a pair of comfortable shoes. It is free, and you can do it almost any place or time. You can also take your baby along.\n" +
                "    (3) Include your baby, lying next to you on the floor, while you do abdominal exercises.\n" +
                "    (4) Exercising 10 minutes at a time is fine. We know 150 minutes each week (as per National Physical Activity Guidelines) sounds like a lot of time, but you don't have to do it all at once. Not only is it best to spread your activity out during the week, but you can break it up into smaller chunks of time during the day.\n" +
                "    (5) Don’t be too hard on yourself if your exercise plans go awry. Just do the best you can, and remember – you will get more time to yourself as your baby settles into a predictable routine.\n" +
                "    (6) Tummy and pelvic floor exercises can be done while you’re doing other tasks, either sitting or standing. To help you remember, try performing the exercises whenever you do certain things, such as breastfeeding or driving the car. (For details on tummy and pelvic floor exercises, refer to the Better Health Channel article ‘Postnatal exercise – sample workout’).\n" +
                "    (7) Walk your baby in the pram rather than use the car for short trips.\n" +
                "    (8) Consider building up a home library of exercise dvds. It might be a good idea to include a few tapes that offer shorter workouts too (such as 15 or 30 minutes), just so you don’t have to always find a full hour or more to exercise.\n" +
                "1.65\tGeneral Exercise Safety Suggestions\t\n" +
                "Be guided by your doctor or midwife, but general suggestions include:\n" +
                "    (i) Wear an appropriate bra that offers good support. Don’t rely on your pre-pregnancy sports bra because your back and cup size are likely to have changed. Get measured for a new one.\n" +
                "    (ii) Your exercises should not hurt. If you experience pain or any other unexplained symptoms stop the exercise and consult your doctor if necessary.\n" +
                "1.66\tTypes Of Postnatal Exercises\n" +
                "Recommended postnatal exercise includes:\n" +
                "    (1) Brisk walking\n" +
                "    (2) Aqua aerobics\n" +
                "    (3) Yoga\n" +
                "    (4) Pilates\n" +
                "    (5) Low impact aerobic workouts\n" +
                "    (6) Light weight training.");

        List<String> blood_spot = new ArrayList<String>();
        blood_spot.add("Throughout the UK, all newborn babies a rescreened using something called the blood spottest (it used to be known as the Guthrie test or Heel Prick test).\n" +
                "\"It’s offered to all newborn babies between five and ten days old, and it can screen for up to five conditions (depending on your health authority).\n" +
                "\"It most commonly tests for the following\n" +
                "conditions:\n" +
                "Phenylketonuria: a condition that interferes with an individual’s ability to regulate amino acid. A build-up of amino acids can lead to severe mental handicap.\n" +
                "Congenital hypothryroidism: this is characterised by a lack of the growth hormone thyroxine. Without this hormone normal growth cannot occur.\n" +
                "Cystic fibrosis: this is an inherited condition that affects the lungs and digestive system. Cystic fibrosis is one of the UK's most common life-threatening inherited diseases. Around 9,300people in the UK have this condition which is caused by a faulty gene that controls the movement of salt and water in and out of the cells within the body. It affects the internal organs, especially the lungs and digestive system, by clogging them with thick sticky mucus. This makes it hard to breathe and digest food.\n" +
                "Each week, five babies are born with cystic fibrosis and currently there is no cure. If two carriers of the faulty cystic fibrosis gene have a child, the baby has a 1 in 4 chance of having cystic fibrosis. Over two million people in the UK carry the faulty gene that causes it - around 1 in 25 of the population. Currently half of the cystic fibrosis population will live past 41 years of age, and improvements in treatments mean a baby born today is expected to live even longer. \n" +
                "Less commonly tested conditions are: \n" +
                "1.\tSickle cell disease: an inherited disorder that affects the red blood cells, reducing their ability to carry oxygen around the body.\n" +
                "2.\tMCADD: a rare inherited disorder where the body cannot break down fat effectively.\n" +
                "\"Few babies are diagnosed with the above conditions, however for the few that are, the benefits of screening and early detection are significant.\n" +
                "1.81\tPhysical Examinations\n" +
                "After the birth of your baby, you should be offered two full physical neonatal examinations of\n" +
                "your newborn. The first should take place in the first 72 hours after birth and the second should\n" +
                "be carried out around six weeks after birth to eight weeks old, around the same time you have\n" +
                "your postnatal check-up (see article ). Your baby will be given an overall top-to-toe\n" +
                "physical examination but with a special focus on his eyes, heart, hips and for boys, their testes.\n" +
                "This examination will help identify specific health\n" +
                "conditions including:\n" +
                "1.\tEye abnormalities such as congenital cataracts and retinoblastoma (a rare\n" +
                "childhood cancer).\n" +
                "2.\tCongenital heart disease.\n" +
                "3.\tCongenital dislocated hip (CHD) and\n" +
                "developmental dysplasia of the hip (DDH).\n" +
                "4.\tDelayed descent of boys’ testes.\n" +
                "The examinations will provide you with an opportunity to talk with a healthcare professional about looking after your baby and any concerns you may have about his feeding and health. This will also be a good time to discuss any future immunisations your baby will need.\n" +
                "1.82\tHearing Screening\n" +
                "This test is usually carried out by trained hearing screeners as part of your maternity care in hospital (ask your midwife and/or GP if you have a home birth). It will usually involve a trained screener placing a small soft-tipped earpiece in the outer part of your baby’s ear, which sends clicking sounds down the ear. This type of test is called an automated otoacustic emission (AOAE) screening test. It only takes a few minutes and the results are immediate. If the test does not show a clear result from either one or both of your baby’s ears then your baby will need a second test, however, this is fairly common and doesn’t necessarily mean that he has hearing problems.");
        List<String> ethiopia = new ArrayList<String>();
        ethiopia.add("Ethiopia is one of the countries in Sub Saharan Africa (SSA) with markedly high maternal and neonatal mortality ratio and it was estimated at 676 maternal deaths per 100,000 live births and neonatal mortality rate 37 deaths per 1000 live births in 2011.  Neonatal death accounted for 62% of all infant deaths and 44% of all under-five deaths .Ethiopia has been implementing high impact and cost-effective health interventions as well as strengthening its health system to improve the health status of its population and reduce maternal and neonatal mortality. These interventions include scale up of family planning programs, training and deployment of more midwives, referral system including pediatric referral system, service integration, health extension program (HEP), routine immunization and wild polio reduction. And yet maternal and neonatal mortality rates remain high .The common medical causes for maternal deaths include bleeding, high blood pressure, prolonged and obstructed labour, infections and unsafe abortion.\n" +
                "\n" +
                "Fig 1. A Typical postnatal care picture in Ethiopia \n" +
                "Bleeding and infection following childbirth account for many maternal deaths . Hemorrhage and sepsis accounted for 27.1 and 10.7% of maternal mortality respectively while preterm birth, asphyxia and severe infections contributed to two thirds of all neonatal death. The postnatal period begins immediately after the birth of the baby and extends up to 6 weeks (42 days) after birth. The major purpose of postpartum and postnatal care is to maintain and promote the health of the woman and her baby and to foster an environment that offers help and support to the extended family and community for a wide range of related health and social needs .Two thirds of maternal and newborn deaths occur in the first 2 days after birth. Hence, having postnatal care is important for both the mother and the child to avoid the risk of preventable death by treating complications arising from the delivery as well as to provide the mother with important information on how to care for herself and her child. The World Health Organization (WHO) recommends postnatal visits within the first 24 h from birth, on day 3 (48–72 h) and between days 7–14 after birth, and 6 weeks after birth.\n" +
                "Postpartum care for the mother has conventionally focused on routine observation and examination of vaginal blood loss, uterine involution, blood pressure and body temperature  Similarly,  postnatal care for all newborns should include immediate and exclusive breastfeeding, warming of the infant, hygienic care of the umbilical cord, and timely identification of danger signs with referral and treatment. Postnatal care is the routine care services that every woman and her baby should be offered, appropriate to their individual circumstances after the birth of the baby until the conclusion of the postnatal period. In the absence of postnatal follow-up, numerous cases of puerperal infections become undiagnosed and unreported.\n" +
                "Lack of care in postnatal period from skilled providers may result in death or disability as well as missed opportunities to promote healthy behaviors affecting women, newborns, and children. Although PNC has several benefits and reduces maternal and child mortality significantly, postnatal service use is low in most of SSA countries. In Ethiopia PNC services are made accessible to all women for free, however, the utilization of the services is very low .The findings of the three Ethiopian demographic health surveys (EDHS) showed an improvement in ANC utilization from 27% in 2000 to 28% in 2005 and to 34% in 2011 However, utilization of PNC remained below 10% (3.4% in 2000, 5.8% in 2005 and 7% in 2011). \n" +
                "The EDHS 2011 showed that 32% of women in urban areas received a postnatal checkup from a health professional compared to 2% in rural women. There were few community based studies conducted in Ethiopia which depicted the magnitude of PNC service utilization and associated factors. There has been no facility based studies which showed the magnitude of PNC service utilization and associated factors among urban women. This study addresses the extent and factors affecting PNC service utilization among women who visited health facilities for any maternal and child health services in an urban setting.");
        List<String> india = new ArrayList<String>();
        india.add("After the mother and child have been discharged from hospital, there are no home visits or automatic recalls. It is up to the mother to book two-, four- and six-week check-ups with the hospital. It is traditional for the new mother and baby to be confined to the home (except for medical check-ups) for up to 40 days. Mothers taking their babies out before this should expect surprised reactions. Mother and baby massage is very big in India, and most Indian mothers hire a “dai” (a baby masseur/masseuse). It is advisable to seek recommendations, as some dais can be over-rigorous with babies. There is a strong culture of what mothers should eat after giving birth. These include foods rich in ghee (clarified butter) and fenugreek.\n" +
                "\n" +
                " Local women are usually happy to share these customs with foreigners. Mothers are also expected to make follow-up appointments for their child. In the first year, most babies visit the paediatrician monthly, for weight checks and immunizations. After six weeks, babies will have the following immunizations:\n" +
                "1.\tDPT (first dose)\t\n" +
                "2.\tHIB (first dose)\n" +
                "3.\tOral polio vaccine (second dose)\n" +
                "4.\tHepatitis B (second dose)\n" +
                "5.\tPneumococcal vaccine (first dose)\n" +
                "6.\tRotavirus (first dose)\n" +
                "After ten weeks, babies will have the following immunizations:\n" +
                "1.\tDPT (second dose)\n" +
                "2.\tHIB (second dose)\n" +
                "3.\tOral polio vaccine (third dose)\n" +
                "4.\tRotavirus (second dose)\t\n" +
                "After 14 weeks, babies will have the following immunisations:\n" +
                "1.\tDPT (third dose)\n" +
                "2.\tHIB (third dose)\n" +
                "3.\tOral polio vaccine (fourth dose)\n" +
                "4.\tRotavirus (third dose)\n" +
                "5.\tPneumococcal vaccine (second dose)\n" +
                "After 20 weeks, babies will have the following immunization:\n" +
                "1.\tPneumococcal vaccine (third dose)\n" +
                "After six months, babies will have Influenza vaccine.");
        List<String> nepal = new ArrayList<String>();
        nepal.add("In recent years, Nepal has implemented a variety of programs to improve access to and quality of PNC in the country. While these programs have been implemented by a variety of agencies, most have been run in partnership with the Government of Nepal and have relied heavily on Female Community Health Volunteers (FCHVs) and other cadres of community health workers. The Community-Based Neonatal Care Package, for example, aimed to change health-related behaviors in the community and also provide three home visits in the week after delivery for mothers and newborns alike. The Nepal Family Health Program II worked to increase access to family planning as well as basic health services, including postpartum care. The Birth \n" +
                "Preparedness Package encouraged women and families to plan for their pregnancies as well as the postnatal period, including how to deal with emergency situations. These programs have been quite successful in increasing uptake of PNC among women in their target areas. As many postnatal programs have been scaled up to a national level, crucial facilitators of success have been thorough, high-quality care guidelines; community buy-in; and an adequate number of appropriately-trained personnel.");
        List<String> south_africa = new ArrayList<String>();
        south_africa.add("Postnatal care is the healthcare provided to mothers and their newborn babies after delivery and, in South Africa, it is provided within 1 week (ideally at 3 days: the “3-day visit”) and at 6 weeks post delivery in the public sector.  Most mothers and babies in South Africa receive their postnatal care in community health centers and local authority clinics (the same primary healthcare sites where they receive their antenatal care). Mothers and babies with advanced conditions – such as several co-morbidities in mothers or congenital abnormalities in children – receive postnatal care at secondary referral centers such as district hospitals. \n" +
                "\n" +
                "Postnatal care is essential, as it enables early identification and treatment of complications that may have arisen during the antenatal, intrapartum, and postpartum period – such as hypertension, infection, bleeding, depression and breast problems in the mother; and infection, jaundice, anemia, and feeding difficulties in the neonate. It is estimated that fewer than 50% of mothers and babies in South Africa receive adequate\n" +
                "postnatal care, especially within 1 week, during the 3-day visit. It is also estimated that at least 30% of newborn deaths in South Africa could be averted if at least 90% of mothers and babies received essential interventions early, underscoring the importance of the 3-day postnatal clinic visit to screen for and to treat these complications. \n" +
                "\n" +
                "In addition to enabling early detection of acute and life-threatening conditions in mothers and infants, postnatal care also enables the mothers to obtain counseling and information on infant feeding and nutrition, hygiene, family planning, danger signs in the mother/baby, and other related issues; allowing them to better care for themselves and their babies. As shown by CHIP data, 70% of children under five years of age who perished in South Africa were underweight. While several factors contributed to the malnourishment and subsequent demise of these children (such as economic reasons), essential counseling and guidance on nutrition could avert malnutrition caused by inadequate knowledge on proper feeding of babies. Postnatal care is extremely important for HIV positive mothers and their infants as a continuation of the Prevention of Mother to Child Transmission of HIV (PMTCT) program.15,57 Prior to the birth of the baby, these PMTCT steps are carried out: HIV\n" +
                "\n" +
                "testing of the pregnant mother; CD4 count if the mother tests positive for HIV; initiation of HAART if the mother’s CD4 count is low; counseling of the mother on safe infant feeding and future family planning; and ARV prophylaxis at birth. Many steps of PMTCT are also carried out at postnatal clinics: during the 3-day postnatal visit, HIV positive mothers are able to receive additional counseling on safe infant feeding, family planning, safe sex and other HIV-related concerns. Mothers who have not been tested for HIV may also receive testing and counseling during that first postnatal visit. During the 6-week postnatal clinic visit, HIV-positive mothers get their CD4 counts rechecked to determine whether they should receive HAART and children of HIV-positive mothers also get PCR tests at their 6-week postnatal visit in order to determine their status early. Those children who test positive are referred to pediatric HIV programs and benefit from early initiation of treatments such as ARV therapy and prophylactic Cotrimoxazole – an antibiotic that reduces rates of Pneumocystis carinnii pneumonia (PCP) and other potentially lethal infections in HIV-positive children. \n" +
                "\n" +
                "Postnatal care is extremely important in South Africa, given that postpartum complications are a major cause of maternal morbidity and mortality; and also given the high prevalence of HIV in the country and the need for rigorous implementation of PMTCT.  Yet, postnatal care is not delivered optimally in South Africa. Many gaps and deficiencies exist in its delivery. For example, although there are national postnatal guidelines defining procedures and standards of postnatal care, these guidelines are not properly understood and adhered to by healthcare workers. There is also little documentation of postnatal care and poor transmission of health information and records between the various health centers involved in the infant and mothers care. Further, there is little understanding of the choices women make regarding follow up for themselves and their infants and factors influencing their choices. These, and many other gaps, underscore the need for research to be carried out to further understand the deficiencies in postnatal care, the contributing factors and interventions that can be carried out to improve postnatal care. \n" +
                "\n" +
                "Several interventions have already been proposed to improve aspects of postnatal care in the country. For example, the MRC Unit for Maternal and Infant Health Care Strategies based at the University of Pretoria have developed an “Essential Postnatal Care” training manual and syllabus, aimed at equipping nurses with the knowledge and skills to better detect and manage postpartum complications in mothers and babies Additionally, they developed the postnatal card in 2007, designed to improve postnatal care by: enhancing communication between hospitals where deliveries are carried out and clinics where mothers and infants receive postnatal care; providing a checklist of essential questions to ask and procedures to perform; increasing uptake of postnatal services by mothers by serving as a reminder for mothers to attend their 3-day and 6-week visits with their babies; and acting as an additional patient data record that can be used for research purposes. \n" +
                "\n" +
                "Based on the successes of the postnatal card, a more comprehensive “Health Book” is being developed by the South African department of health; which will enable information about the pregnancy from the first antenatal visit to the last postnatal visit to be recorded in one central location. While these initiatives promise to improve postnatal care in South Africa, more research needs to be carried out to identify additional interventions that are cost-effective and will further improve postnatal care in the country. A suggested intervention is the incorporation of mobile phone technology in postnatal care in the country. Given the ubiquity of cell phones in South Africa, it is likely that the technology can be utilized in several ways. It may be used to improve communication among healthcare providers, and also to enhance communication between providers and patients. \n" +
                "\n" +
                "The technology may also be utilized for patient education. It may also be used for data collection, for research and quality improvement purposes; and many other ways. To date, there is no documentation on the use of mobile phone technology in antenatal or postnatal care in South Africa. There is also no documentation on mobile phone use among the populations served in the public sector, and their patterns and preferences of mobile phone use. Finally, there is no documentation on views of healthcare staff in South Africa regarding the incorporation of new technologies such as mobile phone technology to enhance healthcare delivery – underscoring the great need of research to obtain this information.");
        List<String> kenya = new ArrayList<String>();
        kenya.add("According to the Kenya Demographic Survey (KDHS) the postnatal situation in Kenya is not better either. The report shows that, only 7% attended postnatal care within two days after birth, 27% within three to six weeks and 5% within six weeks. For instant, in central province 44.2% didn’t attend postnatal care, 0.4% attended within 3-6 days and 4.3% within six weeks (KDHS 2008/2009). There is therefore need for awareness creation among women to attend and utilize the postnatal care services offered in health facilities in Kenya. The Kenya general health system is broadly structured into six levels that are level 1-6. The community (level) which comprises families and households, level 2 and 3 consist of primary health sender  where health promotion and basic treatment services are provided and only simple diagnostic and short term in-patient are provided at these levels. \n" +
                "Major treatments are offered in level 4 which comprise of district and sub district hospitals. Provincial general hospitals (level 5) serve as a referral for level 1 -4 and offer major diagnostic and treatments. Level 6 are the national referral and teaching hospitals (MOFI, 2006). Central Province General hospital, Nyeri, Kenya is a level 5 hospital. There are a number of reproductive services offered in Central Province General hospital in Maternal and Child Health/ Family planning (MCH/FP) department which include; Antenatal care, delivery. Family planning, immunization, cervical cancer screening, HIV counseling and testing, postnatal care, health messages among others. A review done in 2010 showed that a total of 5400 attended Antenatal clinic and only 270 (5%) attended postnatal clinic (2010 central province General Hospital report).");
        List<String> norway = new ArrayList<String>();
        norway.add("Some hours after birth you and your baby will move to the postnatal ward. Here you may stay for some days to get your breastfeeding started and rest after the birth. Most maternity and postnatal wards in Norway are mother-child friendly hospitals». This means that you and your baby are in the same room all the time after birth. This way you will get to know your baby. The staff will assist you with breastfeeding. They can also show you how to change diapers and how to bathe and care for your baby. They can also mind your baby for some hours when you need it");

        List<String> nigeria = new ArrayList<String>();
        nigeria.add("Postnatal care is very poor and inadequate in Nigeria. Inspite of the high maternal mortality level in the country, less than half of the women (36%) attend postnatal care services (NPC & ICF Macro, 2009). Globally, more than half a million women die of complications due to pregnancy, child birth and postpartum period annually (Glasier et al., 2006). Despite the call to improve access to maternal health services universally and reduce maternal mortality, maternal and neonatal mortality has remained a great challenge in sub-Saharan Africa. In Africa, about 125,000 women and 870,000 newborns die annually in the first one week after delivery (Charlotte et al 2006), and the lifetime risk of maternal mortality in Africa is 1 in 26 (Barate & Temmerman, 2009). UNICEF’s estimate of 1100 per 100,000 maternal mortality ratio suggests that the maternal health situation for women in Nigeria is quite poor (Harrison, 2009). With an estimated 59,000 maternal deaths annually, Nigeria contributes 10 percent of the world’s maternal deaths (Babalola & Fatusi, 2009). \n" +
                "\n" +
                "The high level of maternal mortality in Nigeria suggests that the achievement of Millennium Development Goal 5 target to reduce maternal mortality by three quarters, by 2015, is far from reality. Worst still, less than half (36%) of women in Nigeria attend postnatal care services (NPC and ICF Macro, 2009). Postnatal care is among the major recommended interventions to reduce maternal and newborn deaths globally. This intervention enables skilled health professionals to dictate postpartum problems and potential complications and provide prompt treatment (Titaley et al., 2010). Further, postnatal care if delivered through health facility-based care, or family community care has the potential to enhance both maternal and infant survival (Titaley et al 2009). Attendance of postnatal care by women influences both women and children's lives, in terms of reducing repeat pregnancies and increasing effective contraceptive use (Dhakal et al 2007). \n" +
                "\n" +
                "Despite the beneficial impact of postnatal care, most women do not attend postnatal care services. It is therefore pertinent to understand the factors influencing the decisions to seek postnatal care. A clear understanding of these factors will provide a policy tool for the development of community interventions that will increase the use of postnatal care services. Existing studies have focused on individual and household predictors of postnatal care and have largely ignored community contextual attributes. For instance, economic status, birth order, place of residence, and region, woman's own occupation and ethnicity, the number of pregnancies and children and the husband's socio-economic status, occupation and education have been found to be important predictors of postnatal care (Ethiopian Society of population studies, 2008; Dhakal et al 2007). Further, exposure to mass media and distance to health facility have been associated with postnatal care (Forte et al 2006; Titaley et al., 2009). \n" +
                "\n" +
                "Given that individuals are nested within households and households within communities, it becomes imperative to look beyond familial factors influencing the decisions to seek postnatal care. Moreover Mackian (2003) argued that individual decisions can also be influenced by community characteristics and that providing knowledge at the individual level is not sufficient to promote health behaviour change. In line with this argument, Stokols (1996) in his social ecological theory also emphasized the health-relevance of the social environment. The theory also holds that human health (including health-seeking behaviour) is influenced by intrapersonal factors and more so, by a wide range of physical and social environmental conditions. These include various geographic, technologic, organizational and socio-cultural conditions that are present within a particular setting or community. Guided by this theoretical framework, this study builds on previous studies by incorporating the role of community contextual factors in the analysis of postnatal care in Nigeria. \n" +
                "\n" +
                "The study draws data from a cross sectional data- the 2008 Nigerian Demographic and Health Survey (NDHS). The 2008 NDHS provided information on population and health indicators at the national, zonal and state levels. The primary sampling unit (PSU), which is referred to as the cluster was selected from the lists of Enumeration Areas (EAs). Sample for the survey was selected using a stratified two-stage cluster design, made up of 888 clusters (NPC and ICF, 2009). A weighted probability sample of 36,800 households was selected in the survey. In all, a total sample of 33,385 women aged 15-49 years and 15,486 men aged 15-59 were interviewed. For the purpose of this study, a sample of 17956 women aged 15-49 years whose recent delivery occurred in the five years preceding the survey was utilized.\n" +
                "\n" +
                "Overall, the percentage of women who received postnatal care for their most recent delivery in the five years preceding the survey was 33.2%.  The lower proportion of women with higher education is consistent with the observation that sub-Saharan Africa is among the world regions where the percentage of tertiary education enrolments have dramatically declined in recent years (NCRIM, 2005. For the entire sample, 54% are Muslims, 44% are Christians, while others are traditionalists. A significant proportion (30%) of the women is unemployed. Ethnic origin of women reflects the dominance of the three major ethnic groups in Nigeria; Hausa 40%, Igbo 12% and Yoruba 15%. More than half of the women (58%) reported that their husbands or other people have a final say over their own health. \n" +
                "\n" +
                "Most of the women were in the two poorest wealth quintiles, while the lowest proportion was in the richest wealth quintile. Majority of the women (71%) were from large households. The largest proportion of women resided in the North west zone (30%), while the lowest proportion lived in the south east zone. A significant proportion of women resided in communities with low level of women’s education, hospital delivery and ethnic diversity In conclusion, The uptake of postnatal care services is inadequate in Nigeria. Huge variations in receiving postnatal care exist at both the individual and community levels. The results of this study suggest the need to focus on individual and community-level differences in the likelihood of receiving postnatal care. ");
        List<String> best = new ArrayList<String>();
        best.add("In as much as there are a lot of good postnatal services in the world, the postnatal care in Norway undoubtedly is the best in the world with a variety of reasons which gives it edge over the countries system. There are several reasons for crowning them as the best in the world like:\n" +
                "a.          Family room\t\n" +
                "At some hospitals your baby’s father or another person may stay with you and the baby after the birth. This may be a postnatal hotel or a family room at a postnatal ward. The person accompanying you must normally pay for board and lodging.\n" +
                "b.\tThe baby’s skills and needs\n" +
                "Your baby has already developed many senses and is a sensitive little being. The newborn child is slightly myopic. It learns to recognize his or her mother’s face after a few days. Babies also recognize voices they hear often. They like to lie close to their mother or father. Babies are absolutely dependent on receiving food and care from us adults. They are helpless. We may not always understand what a baby want but when it cries, we must take it into our arms and comfort it. Babies must not be handled roughly, for example being shaken, as this may cause injury to the brain. You may bathe your baby every day or less frequently. Some children have bowel movements every day, others a few times per week. All babies pass water many times every day. This is a sign that the baby is getting enough milk.\n" +
                "c.\tTalk about the birth\n" +
                "A birth is a major event in your life and in the life of all women. Being able to talk to someone about what has happened may be very good for you. If you experienced unexpected incidents during the birth, it may be very useful to be told why these things happened.\n" +
                "While you are in the postnatal ward you may ask to speak with the midwife or doctor who attended the birth.\n" +
                "d.\tCustoms at the maternity and postnatal ward\n" +
                "Everyone employed at a hospital is duty bound to assist you and your child. The postnatal ward has rules for what may or may not be done there. If you are uncertain, ask the staff. Because we are all different it may not be possible to satisfy all your wishes. If you are sharing a room with other women, you must be considerate of each other.\n" +
                "e.\tVisits at the ward\n" +
                "Women have different wishes and needs for visits. Many people really enjoy visiting a mother who has just had a baby. Some mothers want to hold off visits from friends and relatives until they are home again. For others it is important to be visited during the first postpartum days. Bear in mind that you must consider those you are sharing a room with. If you would like many people to visit you, it may be best if you go to a visitors’ room or another common room to ensure that your roommates can rest peacefully. If you find it difficult when the woman in the next bed has visits, you should ask the staff for assistance.\n" +
                "f.\tFood\n" +
                "Most maternity wards are qualified to prepare food that is suitable for you, if they are notified about what you need. You may for example need Halal food or other special food. If you would like to eat food brought to you from your home, you may ask to use the kitchen or ask the staff to arrange this for you. Traditions during the postnatal period may be a good thing to observe. Most cultures have customs relating to mother and child during this period when they are so vulnerable. Tell the maternity ward staff about which traditions are important for you and\n" +
                "your family.\n" +
                "g.\tOld and new baby-care customs\n" +
                "Many grandmothers are surprised at the absence of rules and fuss when it comes to baby-care these days. A case in point is navel care: In earlier times many were taught that the baby’s navel had to be cleaned and washed in a particular way. The navel had to be powdered or covered with cream and bandaged several times each day. Now we do none\n" +
                "of these things. The navel should be kept dry, but you may bathe your baby as you like. Just make sure that you dry the baby’s skin well afterwards. The stump of the umbilical chord withers and the navel grows within a week. Many other things have also become simpler. We may understand the natural development of babies better. Therefore old customs and habits may not always be the best ones.\n" +
                "h.\tExaminations and samples from your baby\n" +
                "On the first or second day postpartum a pediatrician will come for a thorough check-up of your baby. The doctor will explain everything to you. If the doctor needs to take extra samples or examine your baby, you will be told why. Babies who need to be will be inoculated against hepatitis B or tuberculosis. All babies in Norway (and in many other countries)must have a blood sample taken after birth. This is to determine whether your baby suffers from a disease called phenylketonuria (PKU) or whether the baby is producing inadequate amounts of the thyroxin hormone (TSH). A few babies are born with these diseases each year. They are cured when they receive medication and a special diet. Many other things have also become simpler. We may understand the natural development of babies better. Therefore old customs and habits may not always be the best ones.\n" +
                "i.\tGoing home\n" +
                "When you are about to leave the postnatal ward the midwife will give you good advice about how things will be at home. Ask about anything you would like to know. You will be given some papers from the hospital. Keep these in a safe place. The hospital notifies the population register that you have given birth to a baby. You will be sent a form on which you enter the baby’s name and apply for the child allowance.\n" +
                "j.\tCircumcision of boys\n" +
                "Circumcision of boys is permitted in Norway. \n" +
                "k.\tCircumcision of girls\n" +
                "Circumcision of girls is prohibited by Norwegian law, as it is in most countries in the world. If you live in Norway, you may not send girls abroad to be circumcised. If circumcision has been a tradition in your family, it may appear strange and difficult that it is not permitted here. Talk with the staff at the public health clinic. They can give you information about the Norwegian law on this. They can also put you in contact with other families where this has been discussed.\n" +
                "l.\tBreastfeeding\n" +
                "Your body makes the finest baby food – mother’s milk. It has all the important nutrients. It is always correctly mixed, has the right temperature and is absolutely clean. The most important thing you can do to give your baby a good start in life is to breastfeed it.\n" +
                "1. ampulla\n" +
                "2. milk duct/lactiferous duct\n" +
                "3. adipose tissue\n" +
                "4. glandular tissue\n" +
                "5 connective tissue\n" +
                "Not all babies find it easy to suckle. Not all women find it easy to put their baby to their breast. Ask for assistance. Midwives and children’s nurses are responsible for helping you. Before you go home from the maternity ward, you must find it easy to have your baby suckle. You may become thirsty when you are breast feeding. Keep a jug of water close by. You need2-3 litres of water each day.\n" +
                "m.\tColostrum\n" +
                "Colostrum is the first milk that comes. It is yellow and thick and does not look like regular milk. This is wonderful food for your newborn baby. If your baby suckles its first day of life, it gets these nourishing drops. This milk covers all needs for food during the first days of life for the baby. In some cultures it has been believed that colostrum was not good for the\n" +
                "baby. It was hand expressed and discarded. This was wrong. The yellow colostrum is made especially for newborn babies.\n" +
                "n.\tStarting breastfeeding\n" +
                "The feeding needs of babies are satisfied by what the mother has in her breasts. Never worry that the breasts feel empty during the first days. If you pinch your nipples just a little bit, you will see that some drops appear. That is sufficient. The milk will come in greater quantities after two, three or four days, and this will continue until your baby stops suckling.\n" +
                "\n" +
                "Your baby must be allowed to breastfeed as frequently as it wants to. Ask for assistance to determine whether the baby latches on to the nipple correctly. You may feel sore to begin with, but there should be no pain. The second day after birth is often the great suckling day. Now the baby wants to suckle very frequently. This stimulates the breasts into producing milk and is important for you to produce enough milk. You will have little time for anything else than breastfeeding, eating and drinking this day. Fortunately it becomes easier over time!\n" +
                "\n" +
                "On the third day postpartum the breasts will often be swollen and painful and you may have a slight fever. This is because your breast glands are working hard to produce milk. Let the baby suckle often. After the third day the baby will get more milk with each meal. That gives you more time to rest between each breastfeeding. It is nice to receive encouragement and assistance from other women who have breastfeeding experience.\n" +
                "o.\tFather’s leave\n" +
                "Men who have just become a father are entitled to leave from work for 14 days. Some are paid during their leave, but unfortunately not all.\n" +
                "p.\tPublic health clinic\n" +
                "The public health nurse from your public health clinic will come to your house during the first weeks. You may also contact the clinic if you need assistance. Your baby must have its first health check-up when it is six weeks old. At the public health clinic you will meet other women who have recently had a baby.\n" +
                "q.\tSleep and rest\n" +
                "When you have given birth you need rest and sleep. Your newborn baby will also need to breastfeed in the middle of the night. You will get most rest and sleep if you follow your baby’s sleep rhythm during the first weeks. This means that you must be allowed to sleep in the daytime. It is also important to keep moving. Your body needs activity to be restored to what it was before you became pregnant. It is not healthy to stay in bed all the time.");

        List<String> inadequacy = new ArrayList<String>();
        inadequacy.add("The days and weeks following childbirth, called the postnatal period, is a critical phase in both the lives of the mother and the newborn. However, the quality of care during this time can at times be neglected, resulting in illness, or even infant mortality. With a lack of continuity in care, neonatal readmissions are more frequent and recommendations for breastfeeding are often not complied with. The inadequacy in postnatal care (PNC) can be contributed to both a lack of research on the issues associated with PNC, and differing perceptions of maternal needs among health care staff members, new mothers, and regional cultural practices . Although the postnatal period during the six weeks after childbirth is just as important as the prenatal period, insufficient data exists on the utilization of these services and on the problems faced during this period of care. In the United States, for example, surveillance systems to monitor maternal behaviors and experiences do exist; however, not all states participate in this system. \n" +
                "\n" +
                "These surveillance systems focus on postpartum depression, but not on other factors or complications, and tend to place emphasis on maintaining health during pregnancy. Additionally, the lack of a specific strategic plan that is both comprehensive and encourages mothers to obtain postpartum care has resulted in inconsistent findings nationally. Research on PNC further contributes to data inconsistencies by focusing on breastfeeding and medical care, neglecting the psychosocial care of new mothers. Data investigating the new mother’s depressive symptoms is often outdated, further undermining the effects this may have on her child’s cognitive and emotional development long-term . With the lack of data and research in this area, postpartum maternal health education is somewhat inadequate. In the United States, mothers feel unprepared for the effort and care required during the postnatal period with the lack of information provided. However, new mothers feel that information should be obtained from a doctor more so than from family and friends. \n" +
                "\n" +
                "Contrastingly, in countries like Lebanon, increased education about the importance of PNC increased the use of its services; new mothers preferred the familial and midwifery support they were accustomed to, particularly in rural areas. According to the World Health Organization (WHO), lack of education, poverty, and limited access to health-care facilities are associated with low use of PNC services. In a systematic review, it was found that access to PNC was positively correlated with socioeconomic status, i.e. the higher the socioeconomic status of the mother; the greater access she has to PNC. \n" +
                "\n" +
                "Additionally, women living in urban areas generally have greater access to postnatal services and exposure to health promotion programs than those living in rural areas. Though urban areas demonstrate high population densities and high birth rates, the availability of such services and programs also depends on the affluence of the urban area. Inadequacy in postnatal health care can also be contributed to differing priorities and perceptions among health care staff and new mothers and families, based on regional cultural differences. For example, in South Africa, new mothers were more concerned about routine self-care practices to maintain body image than about medically based physical changes, a focus of the health care staff . \n" +
                "Due to this discrepancy, the needs of the mother are not adequately provided for. In rural Jordan, for example, underutilization of PNC services is due to preferences in maintaining traditional beliefs over government-based health care services. \n" +
                "\n" +
                "\n" +
                "Like Jordan, in some cultures in the United States and Mexico, breastfeeding and wrapping practices are influenced by the cultural beliefs that there should be no separation between mind, body, and spirit, and that doing so allows for a closer mother-infant bond .Therefore, beliefs on how to care for the baby stem from traditional practices in these rural societies, Adv Biotech & Micro 1(3): AIBM.MS.ID.55562 (2016) 001.");
        List<String> dos_and_donts = new ArrayList<String>();
        dos_and_donts.add("Childbirth is one of the most difficult natural processes that a woman’s body goes through. Many soon-to-be mothers do adequate research and preparation for pregnancy and delivery, but while this is important, it shouldn’t stop there. Knowing what to do (and what not to do), not just before and during, but also after delivery, is equally important.\n" +
                "2.41.\tWHAT TO EXPECT AFTER NORMAL DELIVERY\n" +
                "a.\tYour uterus will slowly contract back to its pre-pregnancy size during the first 2 to 6 weeks and will be accompanied by menstrual-like cramps. This doesn’t mean that your post-pregnancy tummy will also shrink back. The extra fat around your middle, your abdominal muscles, and the stretched skin will probably require more time and work to go back to its pre-pregnancy size. \n" +
                "b.\tExpect to have 2 to 3 days of vaginal bleeding similar to when you have a heavy period. This should gradually decrease over the next weeks with the color changing from red to pink/brown. There may still be some spotting 4 to 6 weeks after delivery. \n" +
                "c.\tYou will experience vaginal soreness whether you had an episiotomy, a natural tear, or even if you did not have both. Expect this soreness to last anywhere from a day to a few weeks.\n" +
                "d.\tUrinating and pooping may be difficult and painful.\n" +
                "2.42\tDO’s\n" +
                "Let your doctor or midwife know if you experience any sudden increase in bleeding or if\n" +
                "I\tthe blood you are passing suddenly becomes bright red.\n" +
                "ii.   \tSit on a pillow or a padded ring.\n" +
                "iii. \tPlace ice wrapped in a thin piece of cloth on your perineum for the first few days.        \n" +
                "iv. \tShower every day to clean your perineum.\n" +
                "v. \tChange your sanitary pad at least every 4 hours to lower the risk of infection.\n" +
                "vi. \tMove slowly and carefully. You don’t want your wound to accidentally open again.\n" +
                "vii. \tGet out of bed by rolling to your side before getting up.\n" +
                "viii. \tLie down every few hours to relieve the pressure that is usually on your perineum.\n" +
                "ix.  \tDraw in your pelvic floor when trying to get up from a sitting position or to sit\n" +
                "  down\n" +
                "x. \tPractice good posture by keeping your back straight. This also relieves the pressure.\n" +
                "xi. \tTry to urinate every 3 to 4 hours. You may pour warm water over your perineum\n" +
                "             while  \n" +
                "urinating. \n" +
                "xii. \tLean forward when trying to poop. You may use a piece of clean tissue paper or \n" +
                "sanitary napkin to press firmly but gently on your stitches while you are trying to\n" +
                " poop.\n" +
                "xiii. \tTry gentle pelvic floor exercises. This will help strengthen your pelvic muscles but \n" +
                "remember not to strain and to just go for gentle holds and pushes during the first \n" +
                "weeks. \n" +
                "xiv. \tDrink lots of water. This will help soften your stool, making them easier to pass.\n" +
                "xv. \tEat foods that are high in fiber. This will also ensure that your stool is soft and easy\n" +
                " to\n" +
                " release\n" +
                "xvi. \tSee your doctor at around 6 weeks after giving birth for your post-natal check.\n" +
                "Important: Call your doctor if you experience high fever, or if your wound or your discharge has a foul odour.\n" +
                "2.43.\tDON’Ts\n" +
                "1. Don’t go swimming until your bleeding has stopped. Swimming increases the chances\n" +
                "    Of exposure to bacteria.\n" +
                "2. Don’t use tampons until after you’ve seen your doctor for your post-natal check.\n" +
                "3. Don’t make sudden movements.\n" +
                "4. Don’t strain or lift/carry heavy objects. \n" +
                "5. Don’t strain when trying to poop. The muscles you use for pooping are the same muscles\n" +
                "    that you overexerted during childbirth.  \n" +
                "6. Don’t engage in high impact exercises and activities. No matter how quickly you want \n" +
                "    to get rid of the bulges in your tummy, your body needs time to recover, so the exercise will\n" +
                "     have to wait.\n" +
                "7. Don’t wear clothes that are tight around your perineal area. Not only will these be\n" +
                "   uncomfortable, it also increases the risk of infection. \n" +
                "8. Don’t have sex until after you’ve seen your doctor for your post-natal check.");
        List<String> infant_death = new ArrayList<String>();
        infant_death.add("A female infant was born to a 19-year-old primigravida following an uneventful pregnancy. Spontaneous vaginal delivery occurred in a community hospital at 40 weeks’ gestation. The mother did not receive any opioid analgesics before delivery. Apgar scores were 9 at 1 min and 10 at 5 min. The baby was admitted to the maternal newborn service. Assistance with breastfeeding in the side-lying position was provided to the mother.\n" +
                "On a routine check 9.5 h after birth, the baby was found blue and unresponsive, lying in bed beside the mother. The mother reported that she had been breastfeeding the baby and had fallen asleep. Cardiopulmonary resuscitation of the infant resulted in recovery of circulation after approximately 10 min. The baby was transferred to the regional centre for ongoing care. She was treated with therapeutic hypothermia for 72 h for severe hypoxic ischemic encephalopathy. She experienced one episode of seizure-like activity, which was treated with phenobarbital. She required cardiac support with inotropic agents. \n" +
                "Both her electroencephalogram and magnetic resonance imaging were abnormal. Her neurological examination remained abnormal with absence of a gag reflex, fixed and dilated pupils, and lack of spontaneous movement. A discussion was undertaken with the family regarding withdrawal of care. The baby died shortly thereafter. Blood culture, metabolic screening and echocardiography were all negative. Permission for autopsy was not granted.\n" +
                "Unexpected sudden infant death (SID) and severe apparent life-threatening events in a healthy newborn infant in the early postnatal period are rare. Recent population-based studies from the United Kingdom and Germany found incidences of five per 100,000 live births within the first 12 h and 2.6 per 100,000 live births within the first 24 h, respectively. Despite initial resuscitation, there is a high risk of death or long-term neurological disability. In a minority of cases, an underlying condition will be found, but most remain unexplained . Factors identified as possibly playing a role include prone position of an infant on the mother’s chest, airway obstruction during breastfeeding, primiparity and maternal fatigue/sedation.\n" +
                "This issue is of both medical and public health importance because some of these catastrophic events may be preventable. There is currently no national system available in Canada for investigating and reporting these cases. The Canadian Paediatric Surveillance Program study on SID/severe apparent life-threatening events began in January 2013 to determine the incidence of SID and severe apparent life-threatening events in Canada, to collect information on associated risk factors, to describe the clinical presentation, to document possible underlying conditions and causes, and to describe the short-term outcomes of surviving infants.");



        listDataChild.put(listDataHeader.get(0), introduction); // Header, Child data
        listDataChild.put(listDataHeader.get(1), towhom);
        listDataChild.put(listDataHeader.get(2), components);
        listDataChild.put(listDataHeader.get(3), yourself);
        listDataChild.put(listDataHeader.get(4), Checks_For_Babies);
        listDataChild.put(listDataHeader.get(5), importance);
        listDataChild.put(listDataHeader.get(6), exercise);
        listDataChild.put(listDataHeader.get(7), blood_spot);
        listDataChild.put(listDataHeader.get(8), ethiopia);
        listDataChild.put(listDataHeader.get(9), india);
        listDataChild.put(listDataHeader.get(10), nepal);
        listDataChild.put(listDataHeader.get(11), south_africa);
        listDataChild.put(listDataHeader.get(12), kenya);
        listDataChild.put(listDataHeader.get(13), norway);
        listDataChild.put(listDataHeader.get(14), nigeria);
        listDataChild.put(listDataHeader.get(15), best);
        listDataChild.put(listDataHeader.get(16), inadequacy);
        listDataChild.put(listDataHeader.get(17), dos_and_donts);
        listDataChild.put(listDataHeader.get(18), infant_death);

    }
}