.class public final Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/intentlauncher/IntentLauncherModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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
.field final synthetic this$0:Lexpo/modules/intentlauncher/IntentLauncherModule;


# direct methods
.method public constructor <init>(Lexpo/modules/intentlauncher/IntentLauncherModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;->this$0:Lexpo/modules/intentlauncher/IntentLauncherModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 6
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;->this$0:Lexpo/modules/intentlauncher/IntentLauncherModule;

    invoke-static {v0}, Lexpo/modules/intentlauncher/IntentLauncherModule;->access$getContext(Lexpo/modules/intentlauncher/IntentLauncherModule;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;->this$0:Lexpo/modules/intentlauncher/IntentLauncherModule;

    invoke-virtual {p1}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object p1

    invoke-virtual {p1}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 4
    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1

    .line 5
    :cond_0
    new-instance v0, Lexpo/modules/intentlauncher/exceptions/PackageNotFoundException;

    invoke-direct {v0, p1}, Lexpo/modules/intentlauncher/exceptions/PackageNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
