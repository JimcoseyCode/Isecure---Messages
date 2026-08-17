.class public final synthetic Lexpo/modules/kotlin/functions/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/jni/JNIFunctionBody;


# instance fields
.field public final synthetic a:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lexpo/modules/kotlin/AppContext;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/functions/SyncFunctionComponent;Ljava/lang/String;Lexpo/modules/kotlin/AppContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/functions/d;->a:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/kotlin/functions/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/kotlin/functions/d;->c:Lexpo/modules/kotlin/AppContext;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/d;->a:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/functions/d;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/kotlin/functions/d;->c:Lexpo/modules/kotlin/AppContext;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;->a(Lexpo/modules/kotlin/functions/SyncFunctionComponent;Ljava/lang/String;Lexpo/modules/kotlin/AppContext;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
