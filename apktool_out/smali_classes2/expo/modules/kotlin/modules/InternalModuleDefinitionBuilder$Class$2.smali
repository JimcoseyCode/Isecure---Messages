.class public final Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Class$default(Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;Ljava/lang/String;LC7/d;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0xb0
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;

    .line 5
    .line 6
    invoke-direct {v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;-><init>()V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;->INSTANCE:Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder$Class$2;->invoke(Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke(Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
