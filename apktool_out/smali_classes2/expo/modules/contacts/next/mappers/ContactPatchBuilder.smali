.class public final Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001bJO\u0010#\u001a\u00020\u0000\"\n\u0008\u0000\u0010$\u0018\u0001*\u00020%\"\n\u0008\u0001\u0010&\u0018\u0001*\u00020\'2 \u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H&0+\u0018\u00010*0)2\n\u0010,\u001a\u0006\u0012\u0002\u0008\u00030\u0012H\u0086\u0008R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019\u00a8\u0006-"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;",
        "",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "mapper",
        "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getContactId-S9XCBSM",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getRawContactId-WW_a-ig",
        "getMapper",
        "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "modifiedFields",
        "",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "getModifiedFields",
        "()Ljava/util/Set;",
        "toUpdate",
        "",
        "Lexpo/modules/contacts/next/domain/model/Updatable;",
        "getToUpdate",
        "()Ljava/util/List;",
        "toAppend",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "getToAppend",
        "build",
        "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;",
        "withUpdatable",
        "updatable",
        "withAppendable",
        "appendable",
        "withListProperty",
        "T",
        "Lexpo/modules/contacts/next/records/PatchRecord;",
        "R",
        "Lexpo/modules/contacts/next/records/NewRecord;",
        "property",
        "Lexpo/modules/kotlin/types/ValueOrUndefined;",
        "",
        "Lexpo/modules/kotlin/types/Either;",
        "field",
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
.field private final contactId:Ljava/lang/String;

.field private final mapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

.field private final modifiedFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final rawContactId:Ljava/lang/String;

.field private final toAppend:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/Appendable;",
            ">;"
        }
    .end annotation
.end field

.field private final toUpdate:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/Updatable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;)V
    .locals 1

    const-string v0, "contactId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->contactId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->rawContactId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->mapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 6
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->modifiedFields:Ljava/util/Set;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toUpdate:Ljava/util/List;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toAppend:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;)V

    return-void
.end method


# virtual methods
.method public final build()Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;
    .locals 6

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->contactId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->modifiedFields:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toAppend:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toUpdate:Ljava/util/List;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final getContactId-S9XCBSM()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->contactId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->mapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModifiedFields()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->modifiedFields:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRawContactId-WW_a-ig()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->rawContactId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getToAppend()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/Appendable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toAppend:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getToUpdate()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/Updatable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toUpdate:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final withAppendable(Lexpo/modules/contacts/next/domain/model/Appendable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;
    .locals 1

    .line 1
    const-string v0, "appendable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toAppend:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final synthetic withListProperty(Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lexpo/modules/contacts/next/records/PatchRecord;",
            "R::",
            "Lexpo/modules/contacts/next/records/NewRecord;",
            ">(",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/types/Either<",
            "TT;TR;>;>;>;",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "*>;)",
            "Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;"
        }
    .end annotation

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "field"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/util/List;

    .line 39
    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const-string v2, "T"

    .line 65
    .line 66
    const-class v3, Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v4, 0x4

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object v5, v1

    .line 76
    check-cast v5, Lexpo/modules/kotlin/types/Either;

    .line 77
    .line 78
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v5, v2}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    new-instance p1, Lkotlin/Pair;

    .line 100
    .line 101
    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    check-cast p2, Ljava/util/List;

    .line 109
    .line 110
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/util/List;

    .line 115
    .line 116
    new-instance v0, Ljava/util/ArrayList;

    .line 117
    .line 118
    const/16 v1, 0xa

    .line 119
    .line 120
    invoke-static {p2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Lexpo/modules/kotlin/types/Either;

    .line 142
    .line 143
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v5, v6}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 155
    .line 156
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-static {v0, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_6

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 184
    .line 185
    invoke-virtual {p0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5, v2}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_7

    .line 206
    .line 207
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 212
    .line 213
    invoke-virtual {p0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_7
    new-instance p2, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-static {p1, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_8

    .line 239
    .line 240
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Lexpo/modules/kotlin/types/Either;

    .line 245
    .line 246
    const-string v2, "R"

    .line 247
    .line 248
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Lexpo/modules/contacts/next/records/NewRecord;

    .line 260
    .line 261
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-static {p2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_9

    .line 283
    .line 284
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Lexpo/modules/contacts/next/records/NewRecord;

    .line 289
    .line 290
    invoke-virtual {p0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {p0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v1, v0, v2}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result p2

    .line 314
    if-eqz p2, :cond_a

    .line 315
    .line 316
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    check-cast p2, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 321
    .line 322
    invoke-virtual {p0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_a
    :goto_7
    return-object p0
.end method

.method public final withUpdatable(Lexpo/modules/contacts/next/domain/model/Updatable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;
    .locals 1

    .line 1
    const-string v0, "updatable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->toUpdate:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
