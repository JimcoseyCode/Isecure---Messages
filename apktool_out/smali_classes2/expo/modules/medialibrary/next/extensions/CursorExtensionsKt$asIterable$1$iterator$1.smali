.class public final Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/Iterator;
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Landroid/database/Cursor;",
        ">;",
        "Lx7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "expo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1",
        "",
        "Landroid/database/Cursor;",
        "hasNextCalled",
        "",
        "hasNextCache",
        "hasNext",
        "next",
        "expo-media-library_release"
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
.field final synthetic $this_asIterable:Landroid/database/Cursor;

.field private hasNextCache:Z

.field private hasNextCalled:Z


# direct methods
.method constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->$this_asIterable:Landroid/database/Cursor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->hasNextCalled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->$this_asIterable:Landroid/database/Cursor;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput-boolean v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->hasNextCache:Z

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->hasNextCalled:Z

    .line 15
    .line 16
    :cond_0
    iget-boolean v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->hasNextCache:Z

    .line 17
    .line 18
    return v0
.end method

.method public next()Landroid/database/Cursor;
    .locals 1

    .line 2
    iget-boolean v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->hasNextCalled:Z

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->$this_asIterable:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->hasNextCalled:Z

    .line 5
    iget-object v0, p0, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->$this_asIterable:Landroid/database/Cursor;

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt$asIterable$1$iterator$1;->next()Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
