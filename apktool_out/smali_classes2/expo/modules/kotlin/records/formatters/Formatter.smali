.class public final Lexpo/modules/kotlin/records/formatters/Formatter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/records/formatters/Formatter$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RecordType::",
        "Lexpo/modules/kotlin/records/Record;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0017B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u00030\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000cJ9\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00102\u0010\u0010\u000f\u001a\u000c\u0012\u0004\u0012\u00020\u0001\u0012\u0002\u0008\u00030\u000eH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R*\u0010\u0006\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u00030\u00050\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/kotlin/records/formatters/Formatter;",
        "Lexpo/modules/kotlin/records/Record;",
        "RecordType",
        "",
        "",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector;",
        "selectors",
        "<init>",
        "(Ljava/util/List;)V",
        "record",
        "Lexpo/modules/kotlin/records/formatters/FormattedRecord;",
        "invoke",
        "(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;",
        "format",
        "LC7/m;",
        "property",
        "Lkotlin/Function2;",
        "getAction$expo_modules_core_release",
        "(LC7/m;)Lkotlin/jvm/functions/Function2;",
        "getAction",
        "Ljava/util/List;",
        "getSelectors$expo_modules_core_release",
        "()Ljava/util/List;",
        "Builder",
        "expo-modules-core_release"
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
.field private final selectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;*>;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "selectors"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/records/formatters/Formatter;->selectors:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final format(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRecordType;)",
            "Lexpo/modules/kotlin/records/formatters/FormattedRecord<",
            "TRecordType;>;"
        }
    .end annotation

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Lexpo/modules/kotlin/records/formatters/FormattedRecord;-><init>(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/records/formatters/Formatter;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final getAction$expo_modules_core_release(LC7/m;)Lkotlin/jvm/functions/Function2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC7/m;",
            ")",
            "Lkotlin/jvm/functions/Function2;"
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
    iget-object v0, p0, Lexpo/modules/kotlin/records/formatters/Formatter;->selectors:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v3, v1

    .line 24
    check-cast v3, Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 25
    .line 26
    invoke-virtual {v3}, Lexpo/modules/kotlin/records/formatters/PropertySelector;->getSelector$expo_modules_core_release()Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v1, v2

    .line 44
    :goto_0
    check-cast v1, Lexpo/modules/kotlin/records/formatters/PropertySelector;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector;->getAction$expo_modules_core_release()Lkotlin/jvm/functions/Function2;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_2
    const/4 p1, 0x2

    .line 53
    invoke-static {v2, p1}, Lkotlin/jvm/internal/I;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 58
    .line 59
    return-object p1
.end method

.method public final getSelectors$expo_modules_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/formatters/Formatter;->selectors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final invoke(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRecordType;)",
            "Lexpo/modules/kotlin/records/formatters/FormattedRecord<",
            "TRecordType;>;"
        }
    .end annotation

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Lexpo/modules/kotlin/records/formatters/FormattedRecord;-><init>(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/records/formatters/Formatter;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
