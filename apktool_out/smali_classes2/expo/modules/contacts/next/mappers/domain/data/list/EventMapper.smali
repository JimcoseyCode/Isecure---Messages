.class public final Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$New;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\t\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$New;",
        "<init>",
        "()V",
        "toNew",
        "Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;",
        "record",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;",
        "newValue",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;",
        "toUpdatable",
        "toPatch",
        "Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;",
        "toDto",
        "model",
        "toDomain",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;",
        "toDomain-xjsikGQ",
        "(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

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

.method private final toDomain-xjsikGQ(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;->component1()Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;->component2()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;->component3()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v4, "%02d"

    .line 27
    .line 28
    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v5, "format(...)"

    .line 33
    .line 34
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v3, "-"

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v2, "--"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1
.end method


# virtual methods
.method public bridge synthetic toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;

    move-result-object p1

    return-object p1
.end method

.method public toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;
    .locals 3

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$New;->getDate()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;

    move-result-object v1

    invoke-direct {p0, v1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toDomain-xjsikGQ(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$New;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    move-result-object p1

    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p2, v1, p1, v2}, Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/event/EventLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toDto(Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;)Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    move-result-object p1

    return-object p1
.end method

.method public toDto(Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;)Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;
    .locals 4

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/event/EventModel;->getStartDate-GJoJq_E()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    new-instance v2, Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;

    .line 4
    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->getYear-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 5
    :cond_0
    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->getMonth-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 6
    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->getDay-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 7
    invoke-direct {v2, v1, v3, v0}, Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;-><init>(Ljava/lang/Integer;II)V

    move-object v1, v2

    .line 8
    :cond_1
    new-instance v0, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    .line 9
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;->getDataId-sXKVoX8()Ljava/lang/String;

    move-result-object v2

    .line 10
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/event/EventModel;->getLabel()Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    move-result-object p1

    invoke-virtual {v3, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->toRecord(Lexpo/modules/contacts/next/domain/model/event/EventLabel;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, v2, p1, v1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)V

    return-object v0
.end method

.method public final toNew(Lexpo/modules/contacts/next/records/fields/DateRecord$New;)Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;
    .locals 3

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$New;->getDate()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {p0, v1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toDomain-xjsikGQ(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;

    .line 17
    .line 18
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$New;->getLabel()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, v1, p1, v2}, Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/event/EventLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final toPatch(Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;)Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;
    .locals 4

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;->getDate()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    instance-of v2, v1, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v1, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    .line 24
    .line 25
    invoke-virtual {v1}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;

    .line 30
    .line 31
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toDomain-xjsikGQ(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-static {v1}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->box-impl(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/wrappers/ContactDate;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v1, v3

    .line 45
    :goto_0
    new-instance v2, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    instance-of v1, v1, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    sget-object v1, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    .line 56
    .line 57
    sget-object v2, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    .line 58
    .line 59
    const-string v1, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>"

    .line 60
    .line 61
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    sget-object v1, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;

    .line 65
    .line 66
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;->getLabel()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->toDomain(Lexpo/modules/kotlin/types/ValueOrUndefined;)Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v1, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;

    .line 75
    .line 76
    invoke-direct {v1, v0, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_2
    new-instance p1, Li7/m;

    .line 81
    .line 82
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1
.end method

.method public bridge synthetic toUpdatable(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;)Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable(Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;)Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;
    .locals 4

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;->getDate()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;

    move-result-object v2

    invoke-direct {p0, v2}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toDomain-xjsikGQ(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EventLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    move-result-object p1

    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/event/EventLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
