.class public Lexpo/modules/contacts/next/services/properties/DataProperty;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TDomain::",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "TDto:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0016\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0004\u0008\u0001\u0010\u00032\u00020\u0004B9\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R&\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u000c\u001a\u00020\u000b8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lexpo/modules/contacts/next/services/properties/DataProperty;",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "TDomain",
        "TDto",
        "",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "field",
        "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;",
        "readMapper",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "repository",
        "<init>",
        "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "get",
        "(Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "getField",
        "()Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;",
        "getReadMapper",
        "()Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;",
        "Ljava/lang/String;",
        "getContactId-S9XCBSM",
        "()Ljava/lang/String;",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "getRepository",
        "()Lexpo/modules/contacts/next/domain/ContactRepository;",
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

.field private final field:Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "TTDomain;>;"
        }
    .end annotation
.end field

.field private final readMapper:Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper<",
            "TTDomain;TTDto;>;"
        }
    .end annotation
.end field

.field private final repository:Lexpo/modules/contacts/next/domain/ContactRepository;


# direct methods
.method private constructor <init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "TTDomain;>;",
            "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper<",
            "TTDomain;TTDto;>;",
            "Ljava/lang/String;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            ")V"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->field:Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;

    .line 4
    iput-object p2, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->readMapper:Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;

    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->contactId:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->repository:Lexpo/modules/contacts/next/domain/ContactRepository;

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/contacts/next/services/properties/DataProperty;-><init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;)V

    return-void
.end method


# virtual methods
.method public final get(Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;->label:I

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
    iput v1, v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;-><init>(Lexpo/modules/contacts/next/services/properties/DataProperty;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->repository:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 54
    .line 55
    iget-object v2, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->field:Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;

    .line 56
    .line 57
    iget-object v4, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->contactId:Ljava/lang/String;

    .line 58
    .line 59
    iput v3, v0, Lexpo/modules/contacts/next/services/properties/DataProperty$get$1;->label:I

    .line 60
    .line 61
    invoke-virtual {p1, v2, v4, v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getFieldFromData-m7AL99Q(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 69
    .line 70
    invoke-static {p1}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lexpo/modules/contacts/next/domain/model/Extractable$Data;

    .line 75
    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    return-object p1

    .line 80
    :cond_4
    iget-object v0, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->readMapper:Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;

    .line 81
    .line 82
    invoke-interface {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;->toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1
.end method

.method protected final getContactId-S9XCBSM()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->contactId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getField()Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "TTDomain;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->field:Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getReadMapper()Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper<",
            "TTDomain;TTDto;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->readMapper:Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getRepository()Lexpo/modules/contacts/next/domain/ContactRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/services/properties/DataProperty;->repository:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 2
    .line 3
    return-object v0
.end method
