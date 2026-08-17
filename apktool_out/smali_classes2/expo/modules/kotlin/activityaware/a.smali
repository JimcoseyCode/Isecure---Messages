.class public final synthetic Lexpo/modules/kotlin/activityaware/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;

.field public final synthetic h:Landroidx/appcompat/app/d;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;Landroidx/appcompat/app/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/activityaware/a;->g:Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/kotlin/activityaware/a;->h:Landroidx/appcompat/app/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/activityaware/a;->g:Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/activityaware/a;->h:Landroidx/appcompat/app/d;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;->a(Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;Landroidx/appcompat/app/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
