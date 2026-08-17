.class public final synthetic Lexpo/modules/kotlin/functions/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;


# instance fields
.field public final synthetic a:Ljava/lang/ref/WeakReference;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

.field public final synthetic d:Lexpo/modules/kotlin/AppContext;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lexpo/modules/kotlin/functions/SuspendFunctionComponent;Lexpo/modules/kotlin/AppContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/functions/c;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/kotlin/functions/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/kotlin/functions/c;->c:Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    .line 9
    .line 10
    iput-object p4, p0, Lexpo/modules/kotlin/functions/c;->d:Lexpo/modules/kotlin/AppContext;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/c;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/functions/c;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/kotlin/functions/c;->c:Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/kotlin/functions/c;->d:Lexpo/modules/kotlin/AppContext;

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    move-object v5, p2

    .line 11
    invoke-static/range {v0 .. v5}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lexpo/modules/kotlin/functions/SuspendFunctionComponent;Lexpo/modules/kotlin/AppContext;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
