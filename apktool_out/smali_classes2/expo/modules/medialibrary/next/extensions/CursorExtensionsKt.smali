.class public final Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "asIterable",
        "",
        "Landroid/database/Cursor;",
        "expo-media-library_release"
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
.method public static final asIterable(Landroid/database/Cursor;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            ")",
            "Ljava/lang/Iterable<",
            "Landroid/database/Cursor;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1;-><init>(Landroid/database/Cursor;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
