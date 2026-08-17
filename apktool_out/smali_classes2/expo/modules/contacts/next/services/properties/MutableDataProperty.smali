.class public final Lexpo/modules/contacts/next/services/properties/MutableDataProperty;
.super Lexpo/modules/contacts/next/services/properties/DataProperty;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TDomain::",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "TDto:",
        "Ljava/lang/Object;",
        ">",
        "Lexpo/modules/contacts/next/services/properties/DataProperty<",
        "TTDomain;TTDto;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0004\u0008\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/contacts/next/services/properties/MutableDataProperty;",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "TDomain",
        "TDto",
        "Lexpo/modules/contacts/next/services/properties/DataProperty;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "field",
        "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;",
        "mapper",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "repository",
        "<init>",
        "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "newValue",
        "",
        "set",
        "(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;",
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


# instance fields
.field private final mapper:Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper<",
            "TTDomain;TTDto;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "TTDomain;>;",
            "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper<",
            "TTDomain;TTDto;>;",
            "Ljava/lang/String;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            ")V"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 2
    invoke-direct/range {v1 .. v6}, Lexpo/modules/contacts/next/services/properties/DataProperty;-><init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object v3, v1, Lexpo/modules/contacts/next/services/properties/MutableDataProperty;->mapper:Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/contacts/next/services/properties/MutableDataProperty;-><init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;)V

    return-void
.end method


# virtual methods
.method public final set(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTDto;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;-><init>(Lexpo/modules/contacts/next/services/properties/MutableDataProperty;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v2, :cond_6

    .line 39
    .line 40
    if-eq v2, v6, :cond_5

    .line 41
    .line 42
    if-eq v2, v5, :cond_4

    .line 43
    .line 44
    if-eq v2, v4, :cond_2

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    check-cast p2, Lexpo/modules/contacts/next/domain/wrappers/DataId;

    .line 52
    .line 53
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->unbox-impl()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    iget-object p1, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    check-cast p2, Lexpo/modules/contacts/next/domain/wrappers/RawContactId;

    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/wrappers/RawContactId;->unbox-impl()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object p2, v7

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_5
    iget-object p1, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getField()Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getContactId-S9XCBSM()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    iput-object p1, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput v6, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 111
    .line 112
    invoke-virtual {p2, v2, v8, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getFieldFromData-m7AL99Q(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-ne p2, v1, :cond_7

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 120
    .line 121
    invoke-static {p2}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, Lexpo/modules/contacts/next/domain/model/Extractable$Data;

    .line 126
    .line 127
    if-eqz p2, :cond_8

    .line 128
    .line 129
    invoke-interface {p2}, Lexpo/modules/contacts/next/domain/model/Extractable$Data;->getDataId-sXKVoX8()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    goto :goto_2

    .line 134
    :cond_8
    move-object p2, v7

    .line 135
    :goto_2
    if-eqz p2, :cond_a

    .line 136
    .line 137
    iget-object v2, p0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty;->mapper:Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;

    .line 138
    .line 139
    invoke-interface {v2, p2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;->toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    iput-object v7, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    iput v5, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 150
    .line 151
    invoke-virtual {p2, p1, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->update(Lexpo/modules/contacts/next/domain/model/Updatable;Ln7/f;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-ne p1, v1, :cond_9

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    return-object p1

    .line 159
    :cond_a
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getContactId-S9XCBSM()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iput-object p1, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->L$0:Ljava/lang/Object;

    .line 168
    .line 169
    iput v4, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 170
    .line 171
    invoke-virtual {p2, v2, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getRawContactId-K3SHF88(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    if-ne p2, v1, :cond_b

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_b
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 179
    .line 180
    if-eqz p2, :cond_d

    .line 181
    .line 182
    iget-object v2, p0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty;->mapper:Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;

    .line 183
    .line 184
    invoke-interface {v2, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;->toAppendable-MYK5hZQ(Ljava/lang/Object;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/DataProperty;->getRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    iput-object v7, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->L$0:Ljava/lang/Object;

    .line 193
    .line 194
    iput v3, v0, Lexpo/modules/contacts/next/services/properties/MutableDataProperty$set$1;->label:I

    .line 195
    .line 196
    invoke-virtual {p2, p1, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->append-4zbj8jY(Lexpo/modules/contacts/next/domain/model/Appendable;Ln7/f;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-ne p1, v1, :cond_c

    .line 201
    .line 202
    :goto_4
    return-object v1

    .line 203
    :cond_c
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    return-object p1

    .line 210
    :cond_d
    new-instance p1, Lexpo/modules/contacts/next/RawContactIdNotFoundException;

    .line 211
    .line 212
    invoke-direct {p1, v7, v6, v7}, Lexpo/modules/contacts/next/RawContactIdNotFoundException;-><init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    .line 214
    .line 215
    throw p1
.end method
