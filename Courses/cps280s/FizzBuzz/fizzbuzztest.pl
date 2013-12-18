#!/usr/bin/perl -w

use Term::ANSIColor;

# 1..1000
%fizzbuzz = (
	1 => '1',
	2 => '2',
	3 => 'fizz',
	4 => '4',
	5 => 'buzz',
	6 => 'fizz',
	7 => '7',
	8 => '8',
	9 => 'fizz',
	10 => 'buzz',
	11 => '11',
	12 => 'fizz',
	13 => '13',
	14 => '14',
	15 => 'fizzbuzz',
	16 => '16',
	17 => '17',
	18 => 'fizz',
	19 => '19',
	20 => 'buzz',
	21 => 'fizz',
	22 => '22',
	23 => '23',
	24 => 'fizz',
	25 => 'buzz',
	26 => '26',
	27 => 'fizz',
	28 => '28',
	29 => '29',
	30 => 'fizzbuzz',
	31 => '31',
	32 => '32',
	33 => 'fizz',
	34 => '34',
	35 => 'buzz',
	36 => 'fizz',
	37 => '37',
	38 => '38',
	39 => 'fizz',
	40 => 'buzz',
	41 => '41',
	42 => 'fizz',
	43 => '43',
	44 => '44',
	45 => 'fizzbuzz',
	46 => '46',
	47 => '47',
	48 => 'fizz',
	49 => '49',
	50 => 'buzz',
	51 => 'fizz',
	52 => '52',
	53 => '53',
	54 => 'fizz',
	55 => 'buzz',
	56 => '56',
	57 => 'fizz',
	58 => '58',
	59 => '59',
	60 => 'fizzbuzz',
	61 => '61',
	62 => '62',
	63 => 'fizz',
	64 => '64',
	65 => 'buzz',
	66 => 'fizz',
	67 => '67',
	68 => '68',
	69 => 'fizz',
	70 => 'buzz',
	71 => '71',
	72 => 'fizz',
	73 => '73',
	74 => '74',
	75 => 'fizzbuzz',
	76 => '76',
	77 => '77',
	78 => 'fizz',
	79 => '79',
	80 => 'buzz',
	81 => 'fizz',
	82 => '82',
	83 => '83',
	84 => 'fizz',
	85 => 'buzz',
	86 => '86',
	87 => 'fizz',
	88 => '88',
	89 => '89',
	90 => 'fizzbuzz',
	91 => '91',
	92 => '92',
	93 => 'fizz',
	94 => '94',
	95 => 'buzz',
	96 => 'fizz',
	97 => '97',
	98 => '98',
	99 => 'fizz',
	100 => 'buzz',
	101 => '101',
	102 => 'fizz',
	103 => '103',
	104 => '104',
	105 => 'fizzbuzz',
	106 => '106',
	107 => '107',
	108 => 'fizz',
	109 => '109',
	110 => 'buzz',
	111 => 'fizz',
	112 => '112',
	113 => '113',
	114 => 'fizz',
	115 => 'buzz',
	116 => '116',
	117 => 'fizz',
	118 => '118',
	119 => '119',
	120 => 'fizzbuzz',
	121 => '121',
	122 => '122',
	123 => 'fizz',
	124 => '124',
	125 => 'buzz',
	126 => 'fizz',
	127 => '127',
	128 => '128',
	129 => 'fizz',
	130 => 'buzz',
	131 => '131',
	132 => 'fizz',
	133 => '133',
	134 => '134',
	135 => 'fizzbuzz',
	136 => '136',
	137 => '137',
	138 => 'fizz',
	139 => '139',
	140 => 'buzz',
	141 => 'fizz',
	142 => '142',
	143 => '143',
	144 => 'fizz',
	145 => 'buzz',
	146 => '146',
	147 => 'fizz',
	148 => '148',
	149 => '149',
	150 => 'fizzbuzz',
	151 => '151',
	152 => '152',
	153 => 'fizz',
	154 => '154',
	155 => 'buzz',
	156 => 'fizz',
	157 => '157',
	158 => '158',
	159 => 'fizz',
	160 => 'buzz',
	161 => '161',
	162 => 'fizz',
	163 => '163',
	164 => '164',
	165 => 'fizzbuzz',
	166 => '166',
	167 => '167',
	168 => 'fizz',
	169 => '169',
	170 => 'buzz',
	171 => 'fizz',
	172 => '172',
	173 => '173',
	174 => 'fizz',
	175 => 'buzz',
	176 => '176',
	177 => 'fizz',
	178 => '178',
	179 => '179',
	180 => 'fizzbuzz',
	181 => '181',
	182 => '182',
	183 => 'fizz',
	184 => '184',
	185 => 'buzz',
	186 => 'fizz',
	187 => '187',
	188 => '188',
	189 => 'fizz',
	190 => 'buzz',
	191 => '191',
	192 => 'fizz',
	193 => '193',
	194 => '194',
	195 => 'fizzbuzz',
	196 => '196',
	197 => '197',
	198 => 'fizz',
	199 => '199',
	200 => 'buzz',
	201 => 'fizz',
	202 => '202',
	203 => '203',
	204 => 'fizz',
	205 => 'buzz',
	206 => '206',
	207 => 'fizz',
	208 => '208',
	209 => '209',
	210 => 'fizzbuzz',
	211 => '211',
	212 => '212',
	213 => 'fizz',
	214 => '214',
	215 => 'buzz',
	216 => 'fizz',
	217 => '217',
	218 => '218',
	219 => 'fizz',
	220 => 'buzz',
	221 => '221',
	222 => 'fizz',
	223 => '223',
	224 => '224',
	225 => 'fizzbuzz',
	226 => '226',
	227 => '227',
	228 => 'fizz',
	229 => '229',
	230 => 'buzz',
	231 => 'fizz',
	232 => '232',
	233 => '233',
	234 => 'fizz',
	235 => 'buzz',
	236 => '236',
	237 => 'fizz',
	238 => '238',
	239 => '239',
	240 => 'fizzbuzz',
	241 => '241',
	242 => '242',
	243 => 'fizz',
	244 => '244',
	245 => 'buzz',
	246 => 'fizz',
	247 => '247',
	248 => '248',
	249 => 'fizz',
	250 => 'buzz',
	251 => '251',
	252 => 'fizz',
	253 => '253',
	254 => '254',
	255 => 'fizzbuzz',
	256 => '256',
	257 => '257',
	258 => 'fizz',
	259 => '259',
	260 => 'buzz',
	261 => 'fizz',
	262 => '262',
	263 => '263',
	264 => 'fizz',
	265 => 'buzz',
	266 => '266',
	267 => 'fizz',
	268 => '268',
	269 => '269',
	270 => 'fizzbuzz',
	271 => '271',
	272 => '272',
	273 => 'fizz',
	274 => '274',
	275 => 'buzz',
	276 => 'fizz',
	277 => '277',
	278 => '278',
	279 => 'fizz',
	280 => 'buzz',
	281 => '281',
	282 => 'fizz',
	283 => '283',
	284 => '284',
	285 => 'fizzbuzz',
	286 => '286',
	287 => '287',
	288 => 'fizz',
	289 => '289',
	290 => 'buzz',
	291 => 'fizz',
	292 => '292',
	293 => '293',
	294 => 'fizz',
	295 => 'buzz',
	296 => '296',
	297 => 'fizz',
	298 => '298',
	299 => '299',
	300 => 'fizzbuzz',
	301 => '301',
	302 => '302',
	303 => 'fizz',
	304 => '304',
	305 => 'buzz',
	306 => 'fizz',
	307 => '307',
	308 => '308',
	309 => 'fizz',
	310 => 'buzz',
	311 => '311',
	312 => 'fizz',
	313 => '313',
	314 => '314',
	315 => 'fizzbuzz',
	316 => '316',
	317 => '317',
	318 => 'fizz',
	319 => '319',
	320 => 'buzz',
	321 => 'fizz',
	322 => '322',
	323 => '323',
	324 => 'fizz',
	325 => 'buzz',
	326 => '326',
	327 => 'fizz',
	328 => '328',
	329 => '329',
	330 => 'fizzbuzz',
	331 => '331',
	332 => '332',
	333 => 'fizz',
	334 => '334',
	335 => 'buzz',
	336 => 'fizz',
	337 => '337',
	338 => '338',
	339 => 'fizz',
	340 => 'buzz',
	341 => '341',
	342 => 'fizz',
	343 => '343',
	344 => '344',
	345 => 'fizzbuzz',
	346 => '346',
	347 => '347',
	348 => 'fizz',
	349 => '349',
	350 => 'buzz',
	351 => 'fizz',
	352 => '352',
	353 => '353',
	354 => 'fizz',
	355 => 'buzz',
	356 => '356',
	357 => 'fizz',
	358 => '358',
	359 => '359',
	360 => 'fizzbuzz',
	361 => '361',
	362 => '362',
	363 => 'fizz',
	364 => '364',
	365 => 'buzz',
	366 => 'fizz',
	367 => '367',
	368 => '368',
	369 => 'fizz',
	370 => 'buzz',
	371 => '371',
	372 => 'fizz',
	373 => '373',
	374 => '374',
	375 => 'fizzbuzz',
	376 => '376',
	377 => '377',
	378 => 'fizz',
	379 => '379',
	380 => 'buzz',
	381 => 'fizz',
	382 => '382',
	383 => '383',
	384 => 'fizz',
	385 => 'buzz',
	386 => '386',
	387 => 'fizz',
	388 => '388',
	389 => '389',
	390 => 'fizzbuzz',
	391 => '391',
	392 => '392',
	393 => 'fizz',
	394 => '394',
	395 => 'buzz',
	396 => 'fizz',
	397 => '397',
	398 => '398',
	399 => 'fizz',
	400 => 'buzz',
	401 => '401',
	402 => 'fizz',
	403 => '403',
	404 => '404',
	405 => 'fizzbuzz',
	406 => '406',
	407 => '407',
	408 => 'fizz',
	409 => '409',
	410 => 'buzz',
	411 => 'fizz',
	412 => '412',
	413 => '413',
	414 => 'fizz',
	415 => 'buzz',
	416 => '416',
	417 => 'fizz',
	418 => '418',
	419 => '419',
	420 => 'fizzbuzz',
	421 => '421',
	422 => '422',
	423 => 'fizz',
	424 => '424',
	425 => 'buzz',
	426 => 'fizz',
	427 => '427',
	428 => '428',
	429 => 'fizz',
	430 => 'buzz',
	431 => '431',
	432 => 'fizz',
	433 => '433',
	434 => '434',
	435 => 'fizzbuzz',
	436 => '436',
	437 => '437',
	438 => 'fizz',
	439 => '439',
	440 => 'buzz',
	441 => 'fizz',
	442 => '442',
	443 => '443',
	444 => 'fizz',
	445 => 'buzz',
	446 => '446',
	447 => 'fizz',
	448 => '448',
	449 => '449',
	450 => 'fizzbuzz',
	451 => '451',
	452 => '452',
	453 => 'fizz',
	454 => '454',
	455 => 'buzz',
	456 => 'fizz',
	457 => '457',
	458 => '458',
	459 => 'fizz',
	460 => 'buzz',
	461 => '461',
	462 => 'fizz',
	463 => '463',
	464 => '464',
	465 => 'fizzbuzz',
	466 => '466',
	467 => '467',
	468 => 'fizz',
	469 => '469',
	470 => 'buzz',
	471 => 'fizz',
	472 => '472',
	473 => '473',
	474 => 'fizz',
	475 => 'buzz',
	476 => '476',
	477 => 'fizz',
	478 => '478',
	479 => '479',
	480 => 'fizzbuzz',
	481 => '481',
	482 => '482',
	483 => 'fizz',
	484 => '484',
	485 => 'buzz',
	486 => 'fizz',
	487 => '487',
	488 => '488',
	489 => 'fizz',
	490 => 'buzz',
	491 => '491',
	492 => 'fizz',
	493 => '493',
	494 => '494',
	495 => 'fizzbuzz',
	496 => '496',
	497 => '497',
	498 => 'fizz',
	499 => '499',
	500 => 'buzz',
	501 => 'fizz',
	502 => '502',
	503 => '503',
	504 => 'fizz',
	505 => 'buzz',
	506 => '506',
	507 => 'fizz',
	508 => '508',
	509 => '509',
	510 => 'fizzbuzz',
	511 => '511',
	512 => '512',
	513 => 'fizz',
	514 => '514',
	515 => 'buzz',
	516 => 'fizz',
	517 => '517',
	518 => '518',
	519 => 'fizz',
	520 => 'buzz',
	521 => '521',
	522 => 'fizz',
	523 => '523',
	524 => '524',
	525 => 'fizzbuzz',
	526 => '526',
	527 => '527',
	528 => 'fizz',
	529 => '529',
	530 => 'buzz',
	531 => 'fizz',
	532 => '532',
	533 => '533',
	534 => 'fizz',
	535 => 'buzz',
	536 => '536',
	537 => 'fizz',
	538 => '538',
	539 => '539',
	540 => 'fizzbuzz',
	541 => '541',
	542 => '542',
	543 => 'fizz',
	544 => '544',
	545 => 'buzz',
	546 => 'fizz',
	547 => '547',
	548 => '548',
	549 => 'fizz',
	550 => 'buzz',
	551 => '551',
	552 => 'fizz',
	553 => '553',
	554 => '554',
	555 => 'fizzbuzz',
	556 => '556',
	557 => '557',
	558 => 'fizz',
	559 => '559',
	560 => 'buzz',
	561 => 'fizz',
	562 => '562',
	563 => '563',
	564 => 'fizz',
	565 => 'buzz',
	566 => '566',
	567 => 'fizz',
	568 => '568',
	569 => '569',
	570 => 'fizzbuzz',
	571 => '571',
	572 => '572',
	573 => 'fizz',
	574 => '574',
	575 => 'buzz',
	576 => 'fizz',
	577 => '577',
	578 => '578',
	579 => 'fizz',
	580 => 'buzz',
	581 => '581',
	582 => 'fizz',
	583 => '583',
	584 => '584',
	585 => 'fizzbuzz',
	586 => '586',
	587 => '587',
	588 => 'fizz',
	589 => '589',
	590 => 'buzz',
	591 => 'fizz',
	592 => '592',
	593 => '593',
	594 => 'fizz',
	595 => 'buzz',
	596 => '596',
	597 => 'fizz',
	598 => '598',
	599 => '599',
	600 => 'fizzbuzz',
	601 => '601',
	602 => '602',
	603 => 'fizz',
	604 => '604',
	605 => 'buzz',
	606 => 'fizz',
	607 => '607',
	608 => '608',
	609 => 'fizz',
	610 => 'buzz',
	611 => '611',
	612 => 'fizz',
	613 => '613',
	614 => '614',
	615 => 'fizzbuzz',
	616 => '616',
	617 => '617',
	618 => 'fizz',
	619 => '619',
	620 => 'buzz',
	621 => 'fizz',
	622 => '622',
	623 => '623',
	624 => 'fizz',
	625 => 'buzz',
	626 => '626',
	627 => 'fizz',
	628 => '628',
	629 => '629',
	630 => 'fizzbuzz',
	631 => '631',
	632 => '632',
	633 => 'fizz',
	634 => '634',
	635 => 'buzz',
	636 => 'fizz',
	637 => '637',
	638 => '638',
	639 => 'fizz',
	640 => 'buzz',
	641 => '641',
	642 => 'fizz',
	643 => '643',
	644 => '644',
	645 => 'fizzbuzz',
	646 => '646',
	647 => '647',
	648 => 'fizz',
	649 => '649',
	650 => 'buzz',
	651 => 'fizz',
	652 => '652',
	653 => '653',
	654 => 'fizz',
	655 => 'buzz',
	656 => '656',
	657 => 'fizz',
	658 => '658',
	659 => '659',
	660 => 'fizzbuzz',
	661 => '661',
	662 => '662',
	663 => 'fizz',
	664 => '664',
	665 => 'buzz',
	666 => 'fizz',
	667 => '667',
	668 => '668',
	669 => 'fizz',
	670 => 'buzz',
	671 => '671',
	672 => 'fizz',
	673 => '673',
	674 => '674',
	675 => 'fizzbuzz',
	676 => '676',
	677 => '677',
	678 => 'fizz',
	679 => '679',
	680 => 'buzz',
	681 => 'fizz',
	682 => '682',
	683 => '683',
	684 => 'fizz',
	685 => 'buzz',
	686 => '686',
	687 => 'fizz',
	688 => '688',
	689 => '689',
	690 => 'fizzbuzz',
	691 => '691',
	692 => '692',
	693 => 'fizz',
	694 => '694',
	695 => 'buzz',
	696 => 'fizz',
	697 => '697',
	698 => '698',
	699 => 'fizz',
	700 => 'buzz',
	701 => '701',
	702 => 'fizz',
	703 => '703',
	704 => '704',
	705 => 'fizzbuzz',
	706 => '706',
	707 => '707',
	708 => 'fizz',
	709 => '709',
	710 => 'buzz',
	711 => 'fizz',
	712 => '712',
	713 => '713',
	714 => 'fizz',
	715 => 'buzz',
	716 => '716',
	717 => 'fizz',
	718 => '718',
	719 => '719',
	720 => 'fizzbuzz',
	721 => '721',
	722 => '722',
	723 => 'fizz',
	724 => '724',
	725 => 'buzz',
	726 => 'fizz',
	727 => '727',
	728 => '728',
	729 => 'fizz',
	730 => 'buzz',
	731 => '731',
	732 => 'fizz',
	733 => '733',
	734 => '734',
	735 => 'fizzbuzz',
	736 => '736',
	737 => '737',
	738 => 'fizz',
	739 => '739',
	740 => 'buzz',
	741 => 'fizz',
	742 => '742',
	743 => '743',
	744 => 'fizz',
	745 => 'buzz',
	746 => '746',
	747 => 'fizz',
	748 => '748',
	749 => '749',
	750 => 'fizzbuzz',
	751 => '751',
	752 => '752',
	753 => 'fizz',
	754 => '754',
	755 => 'buzz',
	756 => 'fizz',
	757 => '757',
	758 => '758',
	759 => 'fizz',
	760 => 'buzz',
	761 => '761',
	762 => 'fizz',
	763 => '763',
	764 => '764',
	765 => 'fizzbuzz',
	766 => '766',
	767 => '767',
	768 => 'fizz',
	769 => '769',
	770 => 'buzz',
	771 => 'fizz',
	772 => '772',
	773 => '773',
	774 => 'fizz',
	775 => 'buzz',
	776 => '776',
	777 => 'fizz',
	778 => '778',
	779 => '779',
	780 => 'fizzbuzz',
	781 => '781',
	782 => '782',
	783 => 'fizz',
	784 => '784',
	785 => 'buzz',
	786 => 'fizz',
	787 => '787',
	788 => '788',
	789 => 'fizz',
	790 => 'buzz',
	791 => '791',
	792 => 'fizz',
	793 => '793',
	794 => '794',
	795 => 'fizzbuzz',
	796 => '796',
	797 => '797',
	798 => 'fizz',
	799 => '799',
	800 => 'buzz',
	801 => 'fizz',
	802 => '802',
	803 => '803',
	804 => 'fizz',
	805 => 'buzz',
	806 => '806',
	807 => 'fizz',
	808 => '808',
	809 => '809',
	810 => 'fizzbuzz',
	811 => '811',
	812 => '812',
	813 => 'fizz',
	814 => '814',
	815 => 'buzz',
	816 => 'fizz',
	817 => '817',
	818 => '818',
	819 => 'fizz',
	820 => 'buzz',
	821 => '821',
	822 => 'fizz',
	823 => '823',
	824 => '824',
	825 => 'fizzbuzz',
	826 => '826',
	827 => '827',
	828 => 'fizz',
	829 => '829',
	830 => 'buzz',
	831 => 'fizz',
	832 => '832',
	833 => '833',
	834 => 'fizz',
	835 => 'buzz',
	836 => '836',
	837 => 'fizz',
	838 => '838',
	839 => '839',
	840 => 'fizzbuzz',
	841 => '841',
	842 => '842',
	843 => 'fizz',
	844 => '844',
	845 => 'buzz',
	846 => 'fizz',
	847 => '847',
	848 => '848',
	849 => 'fizz',
	850 => 'buzz',
	851 => '851',
	852 => 'fizz',
	853 => '853',
	854 => '854',
	855 => 'fizzbuzz',
	856 => '856',
	857 => '857',
	858 => 'fizz',
	859 => '859',
	860 => 'buzz',
	861 => 'fizz',
	862 => '862',
	863 => '863',
	864 => 'fizz',
	865 => 'buzz',
	866 => '866',
	867 => 'fizz',
	868 => '868',
	869 => '869',
	870 => 'fizzbuzz',
	871 => '871',
	872 => '872',
	873 => 'fizz',
	874 => '874',
	875 => 'buzz',
	876 => 'fizz',
	877 => '877',
	878 => '878',
	879 => 'fizz',
	880 => 'buzz',
	881 => '881',
	882 => 'fizz',
	883 => '883',
	884 => '884',
	885 => 'fizzbuzz',
	886 => '886',
	887 => '887',
	888 => 'fizz',
	889 => '889',
	890 => 'buzz',
	891 => 'fizz',
	892 => '892',
	893 => '893',
	894 => 'fizz',
	895 => 'buzz',
	896 => '896',
	897 => 'fizz',
	898 => '898',
	899 => '899',
	900 => 'fizzbuzz',
	901 => '901',
	902 => '902',
	903 => 'fizz',
	904 => '904',
	905 => 'buzz',
	906 => 'fizz',
	907 => '907',
	908 => '908',
	909 => 'fizz',
	910 => 'buzz',
	911 => '911',
	912 => 'fizz',
	913 => '913',
	914 => '914',
	915 => 'fizzbuzz',
	916 => '916',
	917 => '917',
	918 => 'fizz',
	919 => '919',
	920 => 'buzz',
	921 => 'fizz',
	922 => '922',
	923 => '923',
	924 => 'fizz',
	925 => 'buzz',
	926 => '926',
	927 => 'fizz',
	928 => '928',
	929 => '929',
	930 => 'fizzbuzz',
	931 => '931',
	932 => '932',
	933 => 'fizz',
	934 => '934',
	935 => 'buzz',
	936 => 'fizz',
	937 => '937',
	938 => '938',
	939 => 'fizz',
	940 => 'buzz',
	941 => '941',
	942 => 'fizz',
	943 => '943',
	944 => '944',
	945 => 'fizzbuzz',
	946 => '946',
	947 => '947',
	948 => 'fizz',
	949 => '949',
	950 => 'buzz',
	951 => 'fizz',
	952 => '952',
	953 => '953',
	954 => 'fizz',
	955 => 'buzz',
	956 => '956',
	957 => 'fizz',
	958 => '958',
	959 => '959',
	960 => 'fizzbuzz',
	961 => '961',
	962 => '962',
	963 => 'fizz',
	964 => '964',
	965 => 'buzz',
	966 => 'fizz',
	967 => '967',
	968 => '968',
	969 => 'fizz',
	970 => 'buzz',
	971 => '971',
	972 => 'fizz',
	973 => '973',
	974 => '974',
	975 => 'fizzbuzz',
	976 => '976',
	977 => '977',
	978 => 'fizz',
	979 => '979',
	980 => 'buzz',
	981 => 'fizz',
	982 => '982',
	983 => '983',
	984 => 'fizz',
	985 => 'buzz',
	986 => '986',
	987 => 'fizz',
	988 => '988',
	989 => '989',
	990 => 'fizzbuzz',
	991 => '991',
	992 => '992',
	993 => 'fizz',
	994 => '994',
	995 => 'buzz',
	996 => 'fizz',
	997 => '997',
	998 => '998',
	999 => 'fizz',
	1000 => 'buzz'
);

#Execute code
@fizzbuzz = `./fizzbuzz.pl`;
#Begin tests

#Print Test#
print "Test 1: ";

#Test 1..10
for $i (1..10){
	#If exists check for correct
	if ($fizzbuzz[$i - 1]){
		#If correct set output to green
		if ($fizzbuzz[$i - 1] eq "$fizzbuzz{$i}\n"){
			$out = colored ['green'], "Passed", "\n";
		}
		else {
			#Failed set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
	}
	else {
			#Not defined set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
}
#Check for value outside of range
if (defined $fizzbuzz[10] ){
	$out = colored ['red'], "Failed", "\n";
}
#print result
print $out;

#Print Test#
print "Test 2: ";
#Open the input or die
open $file, "fizzbuzz.pl"                                       
        or die "unable to open filename: $!";
#Read in all lines                      
@entry = <$file>;
close ($file);
#Go to 100
@entry = map {s/(10)/100/; $_} @entry;
$filename = "fizzbuzz1000.pl";
#Open the input or die
open $file, ">" , $filename                                       
        or die "unable to open filename: $!";
#Write output
foreach $line (@entry){
	print $file $line;
}                   
close($file);
#Make it executable
chmod 0755, $filename
		or die "Couldn't chmod $filename: $!";
@fizzbuzz = `./$filename`;
#Remove it
unlink($filename);
#Test 1..100
for $i (1..100){
	#If exists check for correct
	if (defined $fizzbuzz[$i - 1]){
		#If correct set output to green
		if ($fizzbuzz[$i - 1] eq "$fizzbuzz{$i}\n"){
			$out = colored ['green'], "Passed", "\n";
		}
		else {
			#Failed set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
	}
	else {
			#Not defined set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			print $i;
			last;
		}
}
#Check for value outside of range
if (defined $fizzbuzz[100] ){
	$out = colored ['red'], "Failed", "\n";
}
#print result
print $out;

#Print Test#
print "Test 3: ";

#Open the input or die
open $file, "fizzbuzz.pl"                                       
        or die "unable to open filename: $!";
#Read in all lines                      
@entry = <$file>;
close ($file);
#Go to 500
@entry = map {s/(10)/500/; $_} @entry;
$filename = "fizzbuzz1000.pl";
#Open the input or die
open $file, ">" , $filename                                       
        or die "unable to open filename: $!";
#Write output
foreach $line (@entry){
	print $file $line;
}                   
close($file);
#Make it executable
chmod 0755, $filename
		or die "Couldn't chmod $filename: $!";
@fizzbuzz = `./$filename`;
#Remove it
unlink($filename);

#Test 1..500
for $i (1..500){
	#If exists check for correct
	if (defined $fizzbuzz[$i - 1]){
		#If correct set output to green
		if ($fizzbuzz[$i - 1] eq "$fizzbuzz{$i}\n"){
			$out = colored ['green'], "Passed", "\n";
		}
		else {
			#Failed set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
	}
	else {
			#Not defined set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
}
#Check for value outside of range
if (defined $fizzbuzz[500] ){
	$out = colored ['red'], "Failed", "\n";
}
#print result
print $out;

#Print Test#
print "Test 4: ";

#Open the input or die
open $file, "fizzbuzz.pl"                                       
        or die "unable to open filename: $!";
#Read in all lines                      
@entry = <$file>;
close ($file);
#Go to 1000
@entry = map {s/(10)/1000/; $_} @entry;
$filename = "fizzbuzz1000.pl";
#Open the input or die
open $file, ">" , $filename                                       
        or die "unable to open filename: $!";
#Write output
foreach $line (@entry){
	print $file $line;
}                   
close($file);
#Make it executable
chmod 0755, $filename
		or die "Couldn't chmod $filename: $!";
@fizzbuzz = `./$filename`;
#Remove it
unlink($filename);

#Test 1..1000
for $i (1..1000){
	#If exists check for correct
	if (defined $fizzbuzz[$i - 1]){
		#If correct set output to green
		if ($fizzbuzz[$i - 1] eq "$fizzbuzz{$i}\n"){
			$out = colored ['green'], "Passed", "\n";
		}
		else {
			#Failed set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
	}
	else {
			#Not defined set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
}
#Check for value outside of range
if (defined $fizzbuzz[1000] ){
	$out = colored ['red'], "Failed", "\n";
}
#print result
print $out;

#Print Test#
print "Test 5: ";

#Open the input or die
open $file, "fizzbuzz.pl"                                       
        or die "unable to open filename: $!";
#Read in all lines                      
@entry = <$file>;
close ($file);
#Go from a to z?
@entry = map {s/(1.)/"a"./; $_} @entry;
@entry = map {s/(10)/"z"/; $_} @entry;
$filename = "fizzbuzzAlpha.pl";
#Open the input or die
open $file, ">" , $filename                                       
        or die "unable to open filename: $!";
#Write output
foreach $line (@entry){
	print $file $line;
}                   
close($file);
#Make it executable
chmod 0755, $filename
		or die "Couldn't chmod $filename: $!";

@fizzbuzz = `./$filename`;

#Remove it
unlink($filename);

#Test a..z
for $i (0..23){
	#If exists check for correct
	if (defined $fizzbuzz[$i]){
		#If correct set output to green
		if ($fizzbuzz[$i] eq "fizzbuzz\n"){
			$out = colored ['green'], "Passed", "\n";
		}
		else {
			#Failed set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
	}
	else {
			#Not defined set output to red and exit loop
			$out = colored ['red'], "Failed", "\n";
			last;
		}
}
#print result
print $out;
