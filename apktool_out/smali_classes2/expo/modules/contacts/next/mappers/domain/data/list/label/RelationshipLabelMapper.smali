.class public final Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0008J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;",
        "",
        "<init>",
        "()V",
        "toDomain",
        "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;

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
.method public final toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;
    .locals 2

    if-eqz p1, :cond_f

    .line 1
    invoke-static {p1}, LP8/q;->f0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "assistant"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 3
    :cond_1
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Assistant;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Assistant;

    return-object p1

    .line 4
    :sswitch_1
    const-string v1, "referredby"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    .line 5
    :cond_2
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$ReferredBy;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$ReferredBy;

    return-object p1

    .line 6
    :sswitch_2
    const-string v1, "manager"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 7
    :cond_3
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Manager;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Manager;

    return-object p1

    .line 8
    :sswitch_3
    const-string v1, "brother"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    .line 9
    :cond_4
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Brother;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Brother;

    return-object p1

    .line 10
    :sswitch_4
    const-string v1, "child"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    .line 11
    :cond_5
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Child;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Child;

    return-object p1

    .line 12
    :sswitch_5
    const-string v1, "domesticpartner"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    .line 13
    :cond_6
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$DomesticPartner;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$DomesticPartner;

    return-object p1

    .line 14
    :sswitch_6
    const-string v1, "relative"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 15
    :cond_7
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Relative;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Relative;

    return-object p1

    .line 16
    :sswitch_7
    const-string v1, "partner"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    .line 17
    :cond_8
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Partner;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Partner;

    return-object p1

    .line 18
    :sswitch_8
    const-string v1, "spouse"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    .line 19
    :cond_9
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Spouse;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Spouse;

    return-object p1

    .line 20
    :sswitch_9
    const-string v1, "sister"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    .line 21
    :cond_a
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Sister;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Sister;

    return-object p1

    .line 22
    :sswitch_a
    const-string v1, "parent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    .line 23
    :cond_b
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Parent;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Parent;

    return-object p1

    .line 24
    :sswitch_b
    const-string v1, "mother"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    .line 25
    :cond_c
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Mother;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Mother;

    return-object p1

    .line 26
    :sswitch_c
    const-string v1, "friend"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    .line 27
    :cond_d
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Friend;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Friend;

    return-object p1

    .line 28
    :sswitch_d
    const-string v1, "father"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 29
    :goto_0
    new-instance v0, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;

    invoke-direct {v0, p1}, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 30
    :cond_e
    sget-object p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Father;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Father;

    return-object p1

    .line 31
    :cond_f
    :goto_1
    new-instance p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;

    const-string v0, "other"

    invoke-direct {p1, v0}, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;-><init>(Ljava/lang/String;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x4c647aa4 -> :sswitch_d
        -0x4b79f562 -> :sswitch_c
        -0x3fad453d -> :sswitch_b
        -0x3b54f756 -> :sswitch_a
        -0x35c505dc -> :sswitch_9
        -0x35642d6b -> :sswitch_8
        -0x2f432338 -> :sswitch_7
        -0x210c0534 -> :sswitch_6
        0xa63dea -> :sswitch_5
        0x5a3f51c -> :sswitch_4
        0x8fda4c0 -> :sswitch_3
        0x31c90fad -> :sswitch_2
        0x533fc828 -> :sswitch_1
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
            "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;",
            ">;"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    instance-of v0, p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    if-eqz v0, :cond_0

    check-cast p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    invoke-virtual {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 33
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/RelationshipLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;

    move-result-object p1

    .line 34
    new-instance v0, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 35
    :cond_0
    instance-of p1, p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    if-eqz p1, :cond_1

    sget-object p1, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    .line 36
    sget-object p1, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    const-string v0, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 37
    :cond_1
    new-instance p1, Li7/m;

    invoke-direct {p1}, Li7/m;-><init>()V

    throw p1
.end method

.method public final toRecord(Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Assistant;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p1, "assistant"

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Brother;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string p1, "brother"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Child;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const-string p1, "child"

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_2
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$DomesticPartner;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    const-string p1, "domesticpartner"

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_3
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Father;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    const-string p1, "father"

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_4
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Friend;

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    const-string p1, "friend"

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_5
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Manager;

    .line 49
    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    const-string p1, "manager"

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_6
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Mother;

    .line 56
    .line 57
    if-eqz v0, :cond_7

    .line 58
    .line 59
    const-string p1, "mother"

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_7
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Parent;

    .line 63
    .line 64
    if-eqz v0, :cond_8

    .line 65
    .line 66
    const-string p1, "parent"

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_8
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Partner;

    .line 70
    .line 71
    if-eqz v0, :cond_9

    .line 72
    .line 73
    const-string p1, "partner"

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_9
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$ReferredBy;

    .line 77
    .line 78
    if-eqz v0, :cond_a

    .line 79
    .line 80
    const-string p1, "referredby"

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_a
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Relative;

    .line 84
    .line 85
    if-eqz v0, :cond_b

    .line 86
    .line 87
    const-string p1, "relative"

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_b
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Sister;

    .line 91
    .line 92
    if-eqz v0, :cond_c

    .line 93
    .line 94
    const-string p1, "sister"

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_c
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Spouse;

    .line 98
    .line 99
    if-eqz v0, :cond_d

    .line 100
    .line 101
    const-string p1, "spouse"

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_d
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;

    .line 105
    .line 106
    if-eqz v0, :cond_e

    .line 107
    .line 108
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;->getLabel()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :cond_e
    new-instance p1, Li7/m;

    .line 114
    .line 115
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 116
    .line 117
    .line 118
    throw p1
.end method
