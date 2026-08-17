.class public final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$lambda$51$lambda$45$$inlined$-addInterceptor$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Le9/v$a;",
        "chain",
        "Le9/D;",
        "intercept",
        "(Le9/v$a;)Le9/D;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $progressListener$inlined:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;


# direct methods
.method public constructor <init>(Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$lambda$51$lambda$45$$inlined$-addInterceptor$1;->$progressListener$inlined:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final intercept(Le9/v$a;)Le9/D;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Le9/v$a;->d()Le9/B;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Le9/v$a;->a(Le9/B;)Le9/D;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Le9/D;->u0()Le9/D$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;

    .line 19
    .line 20
    invoke-virtual {p1}, Le9/D;->r()Le9/E;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v2, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$lambda$51$lambda$45$$inlined$-addInterceptor$1;->$progressListener$inlined:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

    .line 25
    .line 26
    invoke-direct {v1, p1, v2}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;-><init>(Le9/E;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Le9/D$a;->c()Le9/D;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method
