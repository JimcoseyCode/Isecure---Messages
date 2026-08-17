.class public final Lexpo/modules/kotlin/records/formatters/FormatterKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u001a\u0008\u0001\u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lexpo/modules/kotlin/records/Record;",
        "RecordType",
        "Lkotlin/Function1;",
        "Lexpo/modules/kotlin/records/formatters/Formatter$Builder;",
        "Li7/B;",
        "body",
        "Lexpo/modules/kotlin/records/formatters/Formatter;",
        "formatter",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/Formatter;",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final formatter(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/Formatter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RecordType::",
            "Lexpo/modules/kotlin/records/Record;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/Formatter<",
            "TRecordType;>;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->build$expo_modules_core_release()Lexpo/modules/kotlin/records/formatters/Formatter;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
