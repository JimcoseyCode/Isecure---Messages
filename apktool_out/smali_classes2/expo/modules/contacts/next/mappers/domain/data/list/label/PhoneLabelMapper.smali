.class public final Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0008J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;",
        "",
        "<init>",
        "()V",
        "toDomain",
        "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;",
        "label",
        "",
        "Lexpo/modules/kotlin/types/ValueOrUndefined;",
        "toRecord",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;
    .locals 3

    .line 1
    const-string v0, "other"

    if-eqz p1, :cond_15

    invoke-static {p1}, LP8/q;->f0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "assistant"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 3
    :cond_1
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Assistant;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Assistant;

    return-object p1

    .line 4
    :sswitch_1
    const-string v0, "workpager"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    .line 5
    :cond_2
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkPager;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkPager;

    return-object p1

    .line 6
    :sswitch_2
    const-string v0, "telex"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 7
    :cond_3
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Telex;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Telex;

    return-object p1

    .line 8
    :sswitch_3
    const-string v0, "radio"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    .line 9
    :cond_4
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Radio;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Radio;

    return-object p1

    .line 10
    :sswitch_4
    const-string v0, "pager"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    .line 11
    :cond_5
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Pager;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Pager;

    return-object p1

    .line 12
    :sswitch_5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    .line 13
    :cond_6
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Other;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Other;

    return-object p1

    .line 14
    :sswitch_6
    const-string v0, "work"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    .line 15
    :cond_7
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Work;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Work;

    return-object p1

    .line 16
    :sswitch_7
    const-string v0, "main"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    .line 17
    :cond_8
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Main;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Main;

    return-object p1

    .line 18
    :sswitch_8
    const-string v0, "isdn"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    .line 19
    :cond_9
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Isdn;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Isdn;

    return-object p1

    .line 20
    :sswitch_9
    const-string v0, "home"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    .line 21
    :cond_a
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Home;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Home;

    return-object p1

    .line 22
    :sswitch_a
    const-string v0, "mms"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    .line 23
    :cond_b
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mms;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mms;

    return-object p1

    .line 24
    :sswitch_b
    const-string v0, "car"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    .line 25
    :cond_c
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Car;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Car;

    return-object p1

    .line 26
    :sswitch_c
    const-string v0, "workmobile"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    .line 27
    :cond_d
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkMobile;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkMobile;

    return-object p1

    .line 28
    :sswitch_d
    const-string v0, "callback"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    .line 29
    :cond_e
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Callback;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Callback;

    return-object p1

    .line 30
    :sswitch_e
    const-string v0, "companymain"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    .line 31
    :cond_f
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$CompanyMain;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$CompanyMain;

    return-object p1

    .line 32
    :sswitch_f
    const-string v0, "ttyTdd"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    .line 33
    :cond_10
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$TtyTdd;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$TtyTdd;

    return-object p1

    .line 34
    :sswitch_10
    const-string v0, "mobile"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    .line 35
    :cond_11
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mobile;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mobile;

    return-object p1

    .line 36
    :sswitch_11
    const-string v0, "faxwork"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    .line 37
    :cond_12
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxWork;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxWork;

    return-object p1

    .line 38
    :sswitch_12
    const-string v0, "faxhome"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    .line 39
    :cond_13
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxHome;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxHome;

    return-object p1

    .line 40
    :sswitch_13
    const-string v0, "otherfax"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 41
    :goto_0
    new-instance v0, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;

    invoke-direct {v0, p1}, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 42
    :cond_14
    sget-object p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$OtherFax;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$OtherFax;

    return-object p1

    .line 43
    :cond_15
    :goto_1
    new-instance p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;

    invoke-direct {p1, v0}, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;-><init>(Ljava/lang/String;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x45ce0df3 -> :sswitch_13
        -0x3ff25684 -> :sswitch_12
        -0x3feb8452 -> :sswitch_11
        -0x3fb56f5e -> :sswitch_10
        -0x3372e8c5 -> :sswitch_f
        -0x1e42444a -> :sswitch_e
        -0xa43dfbb -> :sswitch_d
        -0x964f90d -> :sswitch_c
        0x17fd4 -> :sswitch_b
        0x1a6d3 -> :sswitch_a
        0x30f4df -> :sswitch_9
        0x317734 -> :sswitch_8
        0x3305b9 -> :sswitch_7
        0x37c711 -> :sswitch_6
        0x6527f10 -> :sswitch_5
        0x657efc3 -> :sswitch_4
        0x67413fb -> :sswitch_3
        0x692320e -> :sswitch_2
        0x41e6eb52 -> :sswitch_1
        0x553972de -> :sswitch_0
    .end sparse-switch
.end method

.method public final toDomain(Lexpo/modules/kotlin/types/ValueOrUndefined;)Lexpo/modules/kotlin/types/ValueOrUndefined;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "Ljava/lang/String;",
            ">;)",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;",
            ">;"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    instance-of v0, p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    if-eqz v0, :cond_0

    check-cast p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    invoke-virtual {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 45
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/PhoneLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;

    move-result-object p1

    .line 46
    new-instance v0, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 47
    :cond_0
    instance-of p1, p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    if-eqz p1, :cond_1

    sget-object p1, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    .line 48
    sget-object p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    const-string v0, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 49
    :cond_1
    new-instance p1, Li7/m;

    invoke-direct {p1}, Li7/m;-><init>()V

    throw p1
.end method

.method public final toRecord(Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Home;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p1, "home"

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mobile;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string p1, "mobile"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Work;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const-string p1, "work"

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_2
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxWork;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    const-string p1, "faxWork"

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_3
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$FaxHome;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    const-string p1, "faxHome"

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_4
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Pager;

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    const-string p1, "pager"

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_5
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Other;

    .line 49
    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    const-string p1, "other"

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_6
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Callback;

    .line 56
    .line 57
    if-eqz v0, :cond_7

    .line 58
    .line 59
    const-string p1, "callback"

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_7
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Car;

    .line 63
    .line 64
    if-eqz v0, :cond_8

    .line 65
    .line 66
    const-string p1, "car"

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_8
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$CompanyMain;

    .line 70
    .line 71
    if-eqz v0, :cond_9

    .line 72
    .line 73
    const-string p1, "companyMain"

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_9
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Isdn;

    .line 77
    .line 78
    if-eqz v0, :cond_a

    .line 79
    .line 80
    const-string p1, "isdn"

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_a
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Main;

    .line 84
    .line 85
    if-eqz v0, :cond_b

    .line 86
    .line 87
    const-string p1, "main"

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_b
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$OtherFax;

    .line 91
    .line 92
    if-eqz v0, :cond_c

    .line 93
    .line 94
    const-string p1, "otherFax"

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_c
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Radio;

    .line 98
    .line 99
    if-eqz v0, :cond_d

    .line 100
    .line 101
    const-string p1, "radio"

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_d
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Telex;

    .line 105
    .line 106
    if-eqz v0, :cond_e

    .line 107
    .line 108
    const-string p1, "telex"

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_e
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$TtyTdd;

    .line 112
    .line 113
    if-eqz v0, :cond_f

    .line 114
    .line 115
    const-string p1, "ttyTdd"

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_f
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkMobile;

    .line 119
    .line 120
    if-eqz v0, :cond_10

    .line 121
    .line 122
    const-string p1, "workMobile"

    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_10
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$WorkPager;

    .line 126
    .line 127
    if-eqz v0, :cond_11

    .line 128
    .line 129
    const-string p1, "workPager"

    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_11
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Assistant;

    .line 133
    .line 134
    if-eqz v0, :cond_12

    .line 135
    .line 136
    const-string p1, "assistant"

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_12
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Mms;

    .line 140
    .line 141
    if-eqz v0, :cond_13

    .line 142
    .line 143
    const-string p1, "mms"

    .line 144
    .line 145
    return-object p1

    .line 146
    :cond_13
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel$Custom;

    .line 147
    .line 148
    if-eqz v0, :cond_14

    .line 149
    .line 150
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/phone/PhoneLabel;->getLabel()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    :cond_14
    new-instance p1, Li7/m;

    .line 156
    .line 157
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 158
    .line 159
    .line 160
    throw p1
.end method
