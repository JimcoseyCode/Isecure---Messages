.class final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$21$request$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/filesystem/legacy/RequestBodyDecorator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;


# direct methods
.method constructor <init>(Lexpo/modules/filesystem/legacy/CountingRequestListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$21$request$1;->$progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final decorate(Le9/C;)Le9/C;
    .locals 2

    .line 1
    const-string v0, "requestBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/filesystem/legacy/CountingRequestBody;

    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$21$request$1;->$progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Lexpo/modules/filesystem/legacy/CountingRequestBody;-><init>(Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
